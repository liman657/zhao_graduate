package com.zhao.graduate.service.Impl;

import com.zhao.graduate.POJO.Category;
import com.zhao.graduate.dao.CategoryMapper;
import com.zhao.graduate.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Service("categoryService")
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getAllCategory() {
        return categoryMapper.selectAllCategory();
    }
}
