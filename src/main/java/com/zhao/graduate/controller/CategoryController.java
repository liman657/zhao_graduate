package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.Category;
import com.zhao.graduate.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @RequestMapping("/all")
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

}
