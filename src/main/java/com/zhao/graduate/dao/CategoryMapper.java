package com.zhao.graduate.dao;

import com.zhao.graduate.POJO.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
//@Repository
public interface CategoryMapper {

    public List<Category> selectAllCategory();

}
