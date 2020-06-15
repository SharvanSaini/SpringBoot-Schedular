package com.icsd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icsd.model.User;

public interface UserDao extends JpaRepository<User, Integer>{

}