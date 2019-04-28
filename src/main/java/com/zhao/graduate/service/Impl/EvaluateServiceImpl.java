package com.zhao.graduate.service.Impl;

import com.zhao.graduate.POJO.Evaluate;
import com.zhao.graduate.dao.EvaluateMapper;
import com.zhao.graduate.service.IEvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Service("evaluateService")
public class EvaluateServiceImpl implements IEvaluateService {

    @Autowired
    private EvaluateMapper evaluateMapper;

    @Override
    public List<Evaluate> getEvaluateInfoByShopId(Integer shopId) {
        return evaluateMapper.selectEvaluateByShopId(shopId);
    }
}
