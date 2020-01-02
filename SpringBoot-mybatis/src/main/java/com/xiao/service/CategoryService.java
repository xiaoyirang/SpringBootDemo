package com.xiao.service;

import com.github.pagehelper.PageInfo;
import com.xiao.entity.Category;

public interface CategoryService {

    PageInfo<Category> page(int pageNo, int pageSize);
}
