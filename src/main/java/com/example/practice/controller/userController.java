package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.models.Users;
import com.example.practice.services.UserService;

@RestController
@RequestMapping("/api/users")
public class userController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping
    private List<Users> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/add")
    private Users addUser(@RequestBody Users newUser){
        return userService.addUser(newUser);
    }
}
