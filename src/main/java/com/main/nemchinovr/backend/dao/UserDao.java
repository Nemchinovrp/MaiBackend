package com.main.nemchinovr.backend.dao;

import com.main.nemchinovr.backend.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {

}
