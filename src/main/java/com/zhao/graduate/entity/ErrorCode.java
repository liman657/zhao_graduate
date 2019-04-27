package com.zhao.graduate.entity;

/**
 * autor:liman
 * comment:
 */
public enum ErrorCode {

    E_2000(2000,"账户操作异常"),
    E_9999(9999,"服务繁忙");

    private int code;
    private String msg;


    private ErrorCode(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
