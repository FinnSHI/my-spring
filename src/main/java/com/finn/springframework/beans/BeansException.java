package com.finn.springframework.beans;

/*
 * @description: 异常处理类
 * @author: Finn
 * @create: 2022/07/18 14:49
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
