package com.myamikova.blog.dao;

import com.myamikova.blog.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
