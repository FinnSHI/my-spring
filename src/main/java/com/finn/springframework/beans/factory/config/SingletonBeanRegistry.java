package com.finn.springframework.beans.factory.config;

/*
 * @description: 单例注册接口
 * @author: Finn
 * @create: 2022/07/18 14:40
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
