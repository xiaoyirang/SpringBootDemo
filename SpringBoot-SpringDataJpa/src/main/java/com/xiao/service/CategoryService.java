package com.xiao.service;

import org.springframework.data.domain.Page;

import com.xiao.entity.Category;

public interface CategoryService {

    Page<Category> page(int pageNo, int pageSize);
}
