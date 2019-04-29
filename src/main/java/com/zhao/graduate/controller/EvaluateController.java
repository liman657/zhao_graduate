package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.Evaluate;
import com.zhao.graduate.entity.MsgResult;
import com.zhao.graduate.service.IEvaluateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * autor:liman
 * comment:
 */
@RestController
@RequestMapping("/evaluate")
public class EvaluateController {

    Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private IEvaluateService evaluateService;

    @RequestMapping("/getList")
    public List<Evaluate> getEvaluateByShopId(@RequestParam("shopId") Integer shopId){
        return evaluateService.getEvaluateInfoByShopId(shopId);
    }

    @RequestMapping("/postEvaluate")
    public MsgResult insertEvaluate(@RequestBody Evaluate evaluate){
        logger.info("提价评价,获取的参数为：{}",evaluate);
        evaluate.setDate(new Date());
        MsgResult msgResult = new MsgResult(0,"评价成功");
        int result = evaluateService.addEvaluate(evaluate);
        if(result>0){
            return msgResult;
        }else{
            msgResult.setRetMsg("服务繁忙");
            msgResult.setRetCode(9999);
            return msgResult;
        }
    }

}
