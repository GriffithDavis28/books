package com.example.practice.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Document("checkout")
public class checkout {
    
    @Id
    private String id;

    private String full_name;
    private List<CheckoutDetails> details = new ArrayList<>();
    

    public checkout(String id, Users user, List<CheckoutDetails> details) {
        this.id = id;
        this.details = details;
        
        if(user != null){
            this.full_name = user.getFirstName() + " " + user.getLastName();
        }
    }

    public List<Map<String, Object>> getDetails(){

        List<Map<String, Object>> refinedList =  new ArrayList<>();
        for (CheckoutDetails detail : details){
            Map<String, Object> refinedMap = new HashMap<>();
            refinedMap.put("Book_Name", detail.getBookName());
            refinedMap.put("ISBN", detail.getIsbn());
            refinedList.add(refinedMap);
        }
        return refinedList;
    }
}
