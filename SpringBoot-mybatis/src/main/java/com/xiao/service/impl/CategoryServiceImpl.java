package com.xiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiao.dao.CategoryMapper;
import com.xiao.entity.Category;
import com.xiao.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public PageInfo<Category> page(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);// 设置分页参数
        List<Category> list = categoryMapper.findAll();
        PageInfo<Category> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
