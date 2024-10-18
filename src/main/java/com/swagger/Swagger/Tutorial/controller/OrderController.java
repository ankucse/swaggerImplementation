package com.swagger.Swagger.Tutorial.controller;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * OrderController class to manage order-related APIs.
 */
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private Map<Integer, String> orderDB = new HashMap<>();  // Simulates a simple in-memory order database

    /**
     * API to place a new order.
     *
     * @param orderId Order ID
     * @param product Product associated with the order
     * @return Response message.
     */
    @PostMapping("/{orderId}")
    public String placeOrder(@PathVariable int orderId, @RequestParam String product) {
        orderDB.put(orderId, product);
        return "Order placed with ID: " + orderId + " for Product: " + product;
    }

    /**
     * API to get order details by ID.
     *
     * @param orderId Order ID
     * @return Order details.
     */
    @GetMapping("/{orderId}")
    public String getOrder(@PathVariable int orderId) {
        return orderDB.getOrDefault(orderId, "Order not found");
    }
}

