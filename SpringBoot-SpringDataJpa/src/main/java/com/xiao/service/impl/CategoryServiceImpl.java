package com.xiao.service.impl;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiao.dao.CategoryRepository;
import com.xiao.entity.Category;
import com.xiao.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryRepository categoryRepository;

    @Override
    public Page<Category> page(int pageNo, int pageSize) {
        return categoryRepository.findAll(PageRequest.of(pageNo, pageSize));
    }

}
