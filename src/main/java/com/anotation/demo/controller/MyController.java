package com.anotation.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String getPost(){
        return "This is New Post";
    }
}
