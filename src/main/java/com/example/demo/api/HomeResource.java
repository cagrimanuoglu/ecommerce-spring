package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping("/")
    public String Home() {
        return "Home Page";
    }

    @GetMapping("/user")
    public String User() {
        return "Welcome User Page";
    }

    @GetMapping("/admin")
    public String Admin() {
        return "Welcome Admin Page";
    }
}
