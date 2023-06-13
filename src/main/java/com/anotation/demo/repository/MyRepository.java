package com.anotation.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String getRepo(){
        return "Hello repository how are you?";
    }
}
