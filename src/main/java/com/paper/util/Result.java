package com.paper.util;


import lombok.Data;

/*
* 统一返回格式
*
* */
@Data
public class Result<T> {
    private String code;
    private String message;
    private T t;

    public Result(String code, String message, T t) {
        this.code = code;
        this.message = message;
        this.t = t;
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result() {
    }
}
