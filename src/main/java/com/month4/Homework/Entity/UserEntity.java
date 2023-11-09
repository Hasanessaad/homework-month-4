package com.month4.Homework.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserEntity implements UserDetails {

    private static final long serielVersionUID = 1L;
    private String username;
    private String password;
    private String role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return  null;
    }

    @Override
    public String getPassword(){
        return password;
    }
    @Override
    public String getUsername(){
        return username;
    }

    @Override
    public boolean isAccountNonExpired(){
        return false;
    }

    @Override
    public boolean isAccountNonLocked(){
        return false;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        // Implement the logic for checking if the credentials are non-expired
        return true; // You may want to customize this based on your requirements
    }
    @Override
    public boolean isEnabled() {
        // Implement the logic for checking if the user is enabled
        return true; // You may want to customize this based on your requirements
    }

}
