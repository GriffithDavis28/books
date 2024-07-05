package com.example.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.models.checkout;
import com.example.practice.services.checkoutService;

@RestController
@RequestMapping("/api/checkout")
public class checkoutController {
    
    @Autowired
    private checkoutService checkoutService;

    @PostMapping("/create")
    public checkout createOrder(@RequestBody checkout newOrder){
        return checkoutService.placeOrder(newOrder);
    }
}
