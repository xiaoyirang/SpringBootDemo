package com.xiao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xiao.entity.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    @Select(value = { "select * from category" })
    List<Category> findAll();
}