package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping
    public String welcome(){
        return "Welcome to Spring Security";
    }

    @GetMapping("/public")
    public String publicURL() {
        return "This is public URL content, anyone can access this url without authentication";
    }

    @GetMapping("/protected")
    public String protectedURL() {
        return "This is protected URL content, authentication is required to access this url";
    }
}
