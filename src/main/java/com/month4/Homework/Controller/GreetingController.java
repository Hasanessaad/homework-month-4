package com.month4.Homework.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {
    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("hello USER from API");
    }
    @GetMapping("/goodbye")
    public ResponseEntity<String> SayGoodBye(){
        return  ResponseEntity.ok("Goodbye USER from API");
    }
}