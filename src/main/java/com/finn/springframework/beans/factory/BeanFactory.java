package com.finn.springframework.beans.factory;

import com.finn.springframework.beans.BeansException;

/*
 * @description: Bean工厂接口
 * @author: Finn
 * @create: 2022/07/18 14:09
 */
public interface BeanFactory {

    /*
    * 生产一个bean
    * */
    Object getBean(String name) throws BeansException;
}
