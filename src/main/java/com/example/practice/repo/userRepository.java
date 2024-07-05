package com.example.practice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.models.Users;


@Repository
public interface userRepository extends MongoRepository<Users, String>{
    
}
