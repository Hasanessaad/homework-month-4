package com.month4.Homework.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("hello from API");
    }
    @GetMapping("/goodbye")
    public ResponseEntity<String> SayGoodBye(){
        return  ResponseEntity.ok("Goodbye from API");
    }
}