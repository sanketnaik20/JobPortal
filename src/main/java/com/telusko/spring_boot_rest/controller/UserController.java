package com.telusko.spring_boot_rest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.spring_boot_rest.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.spring_boot_rest.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("register")
    public User register(@RequestBody User user) {
        return service.userSave(user);

    }

}
