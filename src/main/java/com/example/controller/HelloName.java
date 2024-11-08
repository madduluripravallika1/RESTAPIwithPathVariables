package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloName {
    @GetMapping("/Hello/{name}")
    public  String method1(@PathVariable  String  name){
        System.out.println("Hello "+ name);
    return "Hello ,"+name +"!" ;
    }

}
//Question:
//Create a REST API with Path Variables
//Problem: Modify your /hello endpoint to accept a name as a path variable, such as /hello/{name}, and return "Hello, {name}!". For example, /hello/John should return "Hello, John!".
//
//Objective: Learn how to work with path variables in Spring Boot.
