package com.example.practice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document("books")
public class Books {
    
    @Id
    private String id;

    private String name;
    private String author;
    private String publisher;
    private String isbn;
    private String category;
    private String description;
}
