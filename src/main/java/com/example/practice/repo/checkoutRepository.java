package com.example.practice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.models.checkout;


@Repository
public interface checkoutRepository extends MongoRepository<checkout, String> {

}
