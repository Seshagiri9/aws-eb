package com.sec.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoSecurityController {

    @GetMapping("/contact")
    public String getContact(){
        return " call 8976543212";
    }
    @GetMapping("/msg")
    public String getMessage(){
        return "Good Evening";
    }

    @GetMapping("/grook")
    public String getGrook(){
        return "Welcome to JPMC";
    }
}
