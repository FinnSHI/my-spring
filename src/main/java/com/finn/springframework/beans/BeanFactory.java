package com.finn.springframework.beans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * @description: Bean工厂
 * @author: Finn
 * @create: 2022/07/18 14:09
 */
public class BeanFactory {

    /*
    * ConcurrentHashMap: (Bean的name, BeanDefinition)
    * */
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /*
    * 获取bean
    * */
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    /*
    * 注册bean
    * */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
