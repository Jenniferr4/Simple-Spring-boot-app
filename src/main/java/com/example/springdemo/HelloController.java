package com.example.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/add")
    public String addEmp(){
        return "Bonjour from Spring Boot!";
    }
}
