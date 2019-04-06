package com.main.nemchinovr.backend.dao;

import com.main.nemchinovr.backend.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeDao extends JpaRepository<Resume, Integer> {
}
