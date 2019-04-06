package com.main.nemchinovr.backend.controllers;

import com.main.nemchinovr.backend.dao.ResumeDao;
import com.main.nemchinovr.backend.model.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@CrossOrigin
public class ResumeController {
    @Autowired
    private ResumeDao resumeDao;

    @GetMapping("/resume_all")
    public List<Resume> getAllResume(){
        return resumeDao.findAll();
    }
}
