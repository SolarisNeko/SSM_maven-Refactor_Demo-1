package com.kusonl.myException;

public class ErrorException extends Exception {

    // 显示【错误提示】
    private String msg;

    public ErrorException() {
    }

    public ErrorException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
