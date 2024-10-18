package com.swagger.Swagger.Tutorial.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * ProductController class to manage product-related APIs.
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private Map<Integer, String> productDB = new HashMap<>();  // Simulates a simple in-memory product database

    /**
     * API to add a new product.
     *
     * @param productId Product ID
     * @param name      Name of the product
     * @return Response message.
     */
    @PostMapping("/{productId}")
    public String addProduct(@PathVariable int productId, @RequestParam String name) {
        productDB.put(productId, name);
        return "Product added with ID: " + productId + " and Name: " + name;
    }

    /**
     * API to get product details by ID.
     *
     * @param productId Product ID
     * @return Product name.
     */
    @GetMapping("/{productId}")
    public String getProduct(@PathVariable int productId) {
        return productDB.getOrDefault(productId, "Product not found");
    }
}

