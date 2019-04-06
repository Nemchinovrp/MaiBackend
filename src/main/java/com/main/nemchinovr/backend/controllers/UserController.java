package com.main.nemchinovr.backend.controllers;

import com.main.nemchinovr.backend.dao.UserDao;
import com.main.nemchinovr.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("user")
    public User getUser() {
        return new User("Valera", "123456");
    }

    @GetMapping("all")
    public List<User> getAllUsers() {
        return (List<User>) userDao.findAll();
    }
}