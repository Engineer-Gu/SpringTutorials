package com.lovegu.springframework.beans.factory.support;

import com.lovegu.springframework.beans.factory.config.BeanDefinition;

/**
 * @author 老顾
 * @description 注册 bean 的接口
 * @date 2023/1/12
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);
}
