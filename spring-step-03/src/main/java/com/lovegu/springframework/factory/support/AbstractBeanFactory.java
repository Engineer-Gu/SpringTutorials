package com.lovegu.springframework.factory.support;

import com.lovegu.springframework.BeansException;
import com.lovegu.springframework.factory.BeanFactory;
import com.lovegu.springframework.factory.config.BeanDefinition;

/**
 * @author 老顾
 * @description 使用模板模式使定义的抽象 bean 工厂 来获取 bean 对象
 * @date 2023/1/12
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

}
