package com.example.practice.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        this.details = details != null ? details : List.of();
        this.full_name = user != null ? user.getFirstName() + " " + user.getLastName() : null;
    }

    public List<Map<String, Object>> getDetails() {
        return details.stream()
                .map(detail -> {
                    Map<String, Object> refinedMap = new HashMap<>();
                    refinedMap.put("Book_Name", detail.getBookName());
                    refinedMap.put("ISBN", detail.getIsbn());
                    return refinedMap;
                }).collect(Collectors.toList());
    }
}
