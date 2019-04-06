package com.main.nemchinovr.backend.dao;

import com.main.nemchinovr.backend.model.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacancyDao extends JpaRepository<Vacancy, Integer> {
}
