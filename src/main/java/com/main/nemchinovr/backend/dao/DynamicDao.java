package com.main.nemchinovr.backend.dao;

import com.main.nemchinovr.backend.model.Dynamic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DynamicDao extends JpaRepository<Dynamic, Integer> {
}
