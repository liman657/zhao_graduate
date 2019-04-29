package com.zhao.graduate.service;

import com.zhao.graduate.POJO.Evaluate;
import com.zhao.graduate.POJO.UserInfo;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
public interface IEvaluateService {

    List<Evaluate> getEvaluateInfoByShopId(Integer shopId);


    int addEvaluate(Evaluate evaluate);
}
