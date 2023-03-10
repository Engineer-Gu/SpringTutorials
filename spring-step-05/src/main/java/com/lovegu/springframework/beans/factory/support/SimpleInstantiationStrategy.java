package com.lovegu.springframework.beans.factory.support;

import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author 老顾
 * @description 基于 JDK 实例化对象
 * @date 2023/1/13
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        // 通过 beanDefinition 获取 Class 信息
        Class clazz = beanDefinition.getBeanClass();
        try {
            if (ctor != null) {
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            }else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        }catch (Exception e){
            throw new BeansException("实例化错误 [" + clazz.getName() + "]", e);
        }
    }
}
