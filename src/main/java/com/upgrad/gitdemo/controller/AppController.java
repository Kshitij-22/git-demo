package com.upgrad.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    // SOme changes
    @GetMapping("/")
    public String welcome(){
        return "Welcome to the course!";
    }
}
