package com.mai.nemcinovr.backend.controllers;

@RestController
public class UserController {
    @CrudRepositoryAutowired
    private UserDao userDao;

    public List<User> getUser(String name){
        return userDao.findAll();
    }
}
