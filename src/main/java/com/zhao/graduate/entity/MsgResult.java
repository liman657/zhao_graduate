package com.zhao.graduate.entity;

/**
 * autor:liman
 * comment: 返回的消息体
 */
public class MsgResult {

    private int retCode;
    private String retMsg;
    private Object data;

    public MsgResult(int retCode, String retMsg) {
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "retCode=" + retCode +
                ", retMsg='" + retMsg + '\'' +
                '}';
    }
}
