package com.main.nemchinovr.backend.controllers;

import com.main.nemchinovr.backend.dao.DynamicDao;
import com.main.nemchinovr.backend.model.Dynamic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class DynamicController {
    @Autowired
    private DynamicDao dynamicDao;

    @RequestMapping("dynamic_all")
    public List<Dynamic> getAllDynamic() {
        return dynamicDao.findAll();
    }
}
