package com.main.nemchinovr.backend.dao;

import com.main.nemchinovr.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

}
