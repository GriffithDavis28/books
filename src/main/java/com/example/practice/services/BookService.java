package com.example.practice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.models.Books;
import com.example.practice.repo.bookRepository;


@Service
public class BookService {

    @Autowired
    private bookRepository bookRepo;
    
    public List<Books> getBooks(){
        return bookRepo.findAll();
    }

    public Books addBook(Books book) {
        return bookRepo.save(book);
    }
}
