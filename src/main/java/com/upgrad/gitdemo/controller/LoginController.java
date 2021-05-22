package com.upgrad.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/auth")
    public String auth(){
        return "Login Successful";
    }
}
