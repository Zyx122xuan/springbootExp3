package com.provider.entity;

import java.io.Serializable;

public class CommentResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T result;

    public CommentResult(){

    }

    public CommentResult(Integer code, String message, T result){
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getResult() {
        return result;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
