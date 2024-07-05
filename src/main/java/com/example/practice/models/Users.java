package com.example.practice.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document("users")
public class Users{
    
    @Id
    private String id;

    @NonNull
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private List<Address> address;

    public Users(String id, @NonNull String firstName, String lastName, String email, String phoneNumber, List<Address> address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    
}
