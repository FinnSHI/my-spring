package com.finn.springframework.beans.factory.support;

import com.finn.springframework.beans.BeansException;
import com.finn.springframework.beans.factory.config.BeanDefinition;

/*
 * @description: 实例化 Bean 类
 * @author: Finn
 * @create: 2022/07/18 14:56
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    /*
     * 创建单例bean
     * */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            // 根据bean的类型创建一个实例
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        // 加到 single bean 容器内
        addSingleton(beanName, bean);
        return bean;
    }
}