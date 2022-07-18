package com.finn.springframework.beans.factory.support;

import com.finn.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/*
 * @description: 单例注册接口实现类
 * @author: Finn
 * @create: 2022/07/18 14:41
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {

        return singletonObjects.get(beanName);
    }

    /*
    * 1. 受保护的方法：可以被继承者使用
    * */
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
