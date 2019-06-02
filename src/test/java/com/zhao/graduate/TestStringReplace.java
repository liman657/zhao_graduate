package com.zhao.graduate;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

/**
 * autor:liman
 * createtime:2019/6/2
 * comment:
 */
public class TestStringReplace {

    @Test
    public void testStringReplace(){
        String authUrl="https://api.weixin.qq.com/sns/jscode2session?appid=[APPID]&secret=[SECRET]&js_code=[JSCODE]&grant_type=authorization_code";
        String appid = "wx1243a33912ac08ad";
        String secret = "8468a090df2cc8817a24d387d0e22523";
        String code = "033fkqWC0VNnUj2yZvWC0sTPWC0fkqWq";
        String replaceAppid = StringUtils.replace(authUrl, "[APPID]", appid);
//        StringBuffer sb = new StringBuffer(authUrl);
        String replaceSecret = StringUtils.replace(replaceAppid, "[SECRET]", secret);
        String replaceCode = StringUtils.replace(replaceSecret, "[JSCODE]", code);
        System.out.println(replaceCode);
    }

}
