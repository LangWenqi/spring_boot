package com.example.demo.base;

import java.io.Serializable;

/**
 * Created by flame on 2018/6/19下午2:29.
 * web返回结果统一封装
 */
public class Response implements Serializable {

    private static final long serialVersionUID = 7606935295650057732L;

    private Integer code;

    private String msg;

    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
