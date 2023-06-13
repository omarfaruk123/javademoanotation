package com.anotation.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class UserController {
    public String getUserName(){
        return "I am new user";
    }
}
