package org.example.controllers;

import org.bson.types.ObjectId;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * `@authority Tharindu Dilan`
 * 10:56 AM
 * 2023-11-12 - 11 - 2023
 */
@RestController
@RequestMapping("/test")
@CrossOrigin
public class UserController {

    @Autowired
    UserService service;

    @PostMapping
    public ResponseEntity saveUser(){
        service.saveUser(new User("U001","Tharindu","Dilan",22));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public User getUser(){
        return service.find("U001");
    }

}
