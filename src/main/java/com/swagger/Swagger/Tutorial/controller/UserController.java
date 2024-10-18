package com.swagger.Swagger.Tutorial.controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * UserController class to manage user-related APIs.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    private Map<Integer, String> userDB = new HashMap<>();  // Simulates a simple in-memory user database

    /**
     * API to create a new user.
     *
     * @param userId User ID
     * @param name   Name of the user
     * @return Response message.
     */
    @PostMapping("/{userId}")
    public String createUser(@PathVariable int userId, @RequestParam String name) {
        userDB.put(userId, name);
        return "User created with ID: " + userId + " and Name: " + name;
    }

    /**
     * API to get user details by ID.
     *
     * @param userId User ID
     * @return User name.
     */
    @GetMapping("/{userId}")
    public String getUser(@PathVariable int userId) {
        return userDB.getOrDefault(userId, "User not found");
    }
}

