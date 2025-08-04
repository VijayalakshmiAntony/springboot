package com.example.demo.controller; // Ensure this matches your package structure

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Designates this class as a REST controller to handle web requests
@RequestMapping("/") // Maps requests to the root URL "/"
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World!"; 
    }
}