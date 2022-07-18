package com.finn.springframework.beans;

/*
 * @description: 定义Bean的实例化信息
 * @author: Finn
 * @create: 2022/07/18 14:07
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
    public Object getBean() {
        return bean;
    }
}
