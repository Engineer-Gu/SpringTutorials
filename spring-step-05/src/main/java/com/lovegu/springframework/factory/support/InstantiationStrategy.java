package com.lovegu.springframework.factory.support;

import com.lovegu.springframework.BeansException;
import com.lovegu.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author 老顾
 * @description 实例化策略接口
 * @date 2023/1/13
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
