package com.finn.springframework.beans.factory.support;

import com.finn.springframework.beans.factory.config.BeanDefinition;

/*
 * @description: 向注册表中注册 BeanDefinition
 * @author: Finn
 * @create: 2022/07/18 15:10
 */
public interface BeanDefinitionRegistry {

    /*
    * 向注册表中注册 BeanDefinition
    * */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
