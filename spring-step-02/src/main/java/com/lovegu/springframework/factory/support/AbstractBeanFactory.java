package com.lovegu.springframework.factory.support;

import com.lovegu.springframework.factory.BeanFactory;
import com.lovegu.springframework.factory.config.BeanDefinition;
import com.lovegu.springframework.factory.config.DefaultSingletonBeanRegistry;

/**
 * @author 老顾
 * @description 使用模板模式是定义的抽象 bean 工厂 来获取 bean 对象
 * @date 2023/1/12
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);
}
