package com.lovegu.springframework.beans.factory;

import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.lovegu.springframework.beans.factory.config.BeanDefinition;
import com.lovegu.springframework.beans.factory.config.BeanPostProcessor;
import com.lovegu.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author 老顾
 * @description 配置自动装配 Bean 工厂的接口
 * @date 2023/2/2
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
