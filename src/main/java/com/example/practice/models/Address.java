package com.example.practice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String address;
    private String city;
    private String state;
    private String country;
    private int pincode;

    public Address(String address, String city, String state, String country, int pincode) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}
