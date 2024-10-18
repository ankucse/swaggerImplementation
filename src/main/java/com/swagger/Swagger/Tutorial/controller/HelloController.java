package com.swagger.Swagger.Tutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController class to expose a simple REST API.
 * The @RestController annotation marks this class as a REST controller.
 */
@RestController
@RequestMapping("/api")
public class HelloController {
    /**
     * Simple GET API that returns a greeting message.
     * The @GetMapping annotation maps this method to the /hello endpoint.
     *
     * @return String - A greeting message.
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello Swagger"; //Returns a simple String message
    }
}
