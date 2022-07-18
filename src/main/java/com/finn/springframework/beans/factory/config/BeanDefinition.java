package com.finn.springframework.beans.factory.config;

import lombok.Data;

/*
 * @description: 定义Bean的实例化信息
 * @author: Finn
 * @create: 2022/07/18 14:07
 */
@SuppressWarnings({"rawtypes"})
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
