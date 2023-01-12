package com.lovegu.springframework.factory.support;

import com.lovegu.springframework.factory.config.BeanDefinition;

/**
 * @author 老顾
 * @description 创建 bean 对象
 * @date 2023/1/12
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        // 完成实例化后，将单例对象存到集合缓存中
        registerSingleton(beanName, bean);
        return bean;
    }
}
