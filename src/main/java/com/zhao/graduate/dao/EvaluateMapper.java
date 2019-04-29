package com.zhao.graduate.dao;

import com.zhao.graduate.POJO.Evaluate;
import com.zhao.graduate.POJO.UserInfo;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
//@Repository
public interface EvaluateMapper {

    public List<Evaluate> selectEvaluateByShopId(Integer shopId);

    int insertEvaluate(Evaluate evaluate);
}
