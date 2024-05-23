package com.example.clean_architecture.controller;

import com.example.clean_architecture.model.User;
import com.example.clean_architecture.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
            this.userService = userService;
    }

    @PostMapping
    User createUser(@RequestBody User user){
        return userService.create(user);
    }
}
