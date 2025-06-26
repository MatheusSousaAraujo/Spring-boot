package com.exemplo.demo.controller;

import com.exemplo.demo.service.UserService;
import com.exemplo.demo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService service) {
        this.userService = service;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
