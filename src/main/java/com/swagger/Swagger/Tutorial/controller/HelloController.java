package com.swagger.Swagger.Tutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello Swagger API"; //Returns a simple String message
    }

    @GetMapping("/hello")
    public String welcome(){
        return "Welcome to the Swagger API ..." ;
    }
}
