package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.Evaluate;
import com.zhao.graduate.service.IEvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@RestController
@RequestMapping("/evaluate")
public class EvaluateController {

    @Autowired
    private IEvaluateService evaluateService;

    @RequestMapping("/getList")
    public List<Evaluate> getEvaluateByShopId(@RequestParam("shopId") Integer shopId){
        return evaluateService.getEvaluateInfoByShopId(shopId);
    }

}
