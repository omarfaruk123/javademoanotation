package com.anotation.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String getService()
    {
        return "Hello service What's your name ?";
    }
}
