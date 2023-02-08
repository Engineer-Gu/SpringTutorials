package com.lovegu.springframework.beans.factory.config;

import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author 老顾
 * @description 定义 BeanFactoryPostProcessor，提供修改 BeanDefinition 属性的机制
 * @date 2023/2/2
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，且将 Bean 对象实例化之前，提供修改BeanDefinition属性的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
