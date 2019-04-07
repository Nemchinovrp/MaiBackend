package com.main.nemchinovr.backend.controllers;

import com.main.nemchinovr.backend.dao.UserDao;
import com.main.nemchinovr.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController()
@CrossOrigin
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("user")
    public User getUser() {
        return new User("manager", "2019");
    }

    @GetMapping("user_all")
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}
