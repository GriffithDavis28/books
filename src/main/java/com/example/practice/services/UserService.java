package com.example.practice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.models.Users;
import com.example.practice.repo.userRepository;

@Service
public class UserService {
    
    @Autowired
    private userRepository userRepo;

    public List<Users> getUsers(){
        return userRepo.findAll();
    }

    public Users addUser(Users newUser){
        return userRepo.save(newUser);
    }
}
