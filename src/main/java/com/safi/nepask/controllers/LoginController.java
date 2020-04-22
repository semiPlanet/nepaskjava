package com.safi.nepask.controllers;

import java.util.List;

import com.safi.nepask.entities.Login;
import com.safi.nepask.entities.Users;
import com.safi.nepask.interfaces.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class LoginController {
    
    @Autowired
    UserRepository userRepository;

    @GetMapping(value="users")
    public List<Users> users() {
        return userRepository.findAll();
    }

    @PostMapping(value="login")
    public Login login(@RequestBody Login login) {        
        return login;
    }
    
    
}