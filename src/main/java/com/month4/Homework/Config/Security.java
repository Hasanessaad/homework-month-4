package com.month4.Homework.Config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebSecurity
public class Security {
    @Bean
    SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {
            http.cors((cors -> cors.disable()))
                .authorizeHttpRequests( auth->auth
                .requestMatchers("/hello").permitAll()
                    .anyRequest()
                    .authenticated());
                     http.httpBasic(Customizer.withDefaults());
            return http.build();
    }
    @Bean
    UserDetailsService user(){
        UserDetails user = User.builder()
                .username("hasan")
                .password("123")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
}
