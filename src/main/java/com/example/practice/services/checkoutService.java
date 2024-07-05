package com.example.practice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.models.checkout;
import com.example.practice.repo.checkoutRepository;

@Service
public class checkoutService {
    
    @Autowired
    private checkoutRepository checkRepo;

    public checkout placeOrder(checkout newOrder){
        return checkRepo.save(newOrder);
    }
}
