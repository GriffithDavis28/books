package com.example.practice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.models.Books;


@Repository
public interface bookRepository extends MongoRepository<Books, String>{

}
