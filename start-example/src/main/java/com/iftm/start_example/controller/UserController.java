package com.iftm.start_example.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.start_example.model.User;
import com.iftm.start_example.model.dto.UserDTO;
import com.iftm.start_example.service.UserService;




@RestController
@RequestMapping("api/v1/users")
public class UserController {
    
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity <List<UserDTO>> findAll() {
        return service.findAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable("id") ObjectId id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody User user) {
        return service.save(user);
    }
    
    
    
}
