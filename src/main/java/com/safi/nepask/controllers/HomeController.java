package com.safi.nepask.controllers;

import com.safi.nepask.entities.Questions;
import com.safi.nepask.interfaces.QuestionsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private QuestionsRepository questionRepository;
    
    
    @GetMapping(value = "questions")
    public Iterable<Questions> questions() {
        return questionRepository.findAll();
    }
    
}