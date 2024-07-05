package com.example.practice.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckoutDetails {
    
    
    private List<Books> bookDetails = new ArrayList<>();

    private List<String> bookName = new ArrayList<>();
    private List<String> isbn =  new ArrayList<>();

    public CheckoutDetails(List<Books> bookDetails, Users user) {
        this.bookDetails = bookDetails;

        if(bookDetails != null){
            for(Books book : bookDetails){
                if(book != null){
                    this.bookName.add(book.getName());
                    this.isbn.add(book.getIsbn());
                }
            }
        }
    }
}
