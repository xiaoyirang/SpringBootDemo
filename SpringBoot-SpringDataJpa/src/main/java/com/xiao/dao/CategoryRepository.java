package com.xiao.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xiao.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
