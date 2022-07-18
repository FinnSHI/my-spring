package com.finn.springframework.beans.factory.support;

import com.finn.springframework.beans.BeansException;
import com.finn.springframework.beans.factory.BeanFactory;
import com.finn.springframework.beans.factory.config.BeanDefinition;

import java.util.Objects;

/*
 * @description: 抽象类定义模板方法
 *               该抽象类有两个抽象继承类：① AbstractAutowireCapableBeanFactory ② DefaultListableBeanFactory
 *               他们都按照模板模式实现了bean注册的方法
 * @author: Finn
 * @create: 2022/07/18 14:44
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (!Objects.isNull(bean)) {
            return bean;
        }

        // bean为空，进行单例注册
        BeanDefinition beanDefinition = getBeanDefinition(name);

        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
