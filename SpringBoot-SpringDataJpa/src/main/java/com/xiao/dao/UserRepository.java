package com.xiao.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xiao.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
