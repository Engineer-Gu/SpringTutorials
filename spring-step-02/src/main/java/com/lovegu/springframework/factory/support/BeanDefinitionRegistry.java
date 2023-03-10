package com.lovegu.springframework.factory.support;

import com.lovegu.springframework.factory.config.BeanDefinition;

/**
 * @author 老顾
 * @description 注册 bean 的接口
 * @date 2023/1/12
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
