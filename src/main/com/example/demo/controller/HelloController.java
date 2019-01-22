package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable String id){
        System.out.println("HelloController");
        return "Hello Controller";
    }

}
