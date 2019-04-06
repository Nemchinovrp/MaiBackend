package com.main.nemchinovr.backend.controllers;

import com.main.nemchinovr.backend.dao.VacancyDao;
import com.main.nemchinovr.backend.model.Vacancy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@CrossOrigin
public class VacancyController {
    @Autowired
    private VacancyDao vacancyDao;

    @GetMapping("/vacancy_all")
    public List<Vacancy> getAllVacancy() {
        return vacancyDao.findAll();
    }

}
