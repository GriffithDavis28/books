package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.models.Books;
import com.example.practice.services.BookService;


@RestController
@RequestMapping("/api/books")
public class booksControler {

    @Autowired
    private BookService bookService;
    
    @GetMapping
    private List<Books> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping("/add")
    private Books addBook(@RequestBody Books newBook){
        return bookService.addBook(newBook);
    }
}
