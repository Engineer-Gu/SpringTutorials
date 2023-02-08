package com.lovegu.springframework.common;

import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.beans.PropertyValue;
import com.lovegu.springframework.beans.PropertyValues;
import com.lovegu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.lovegu.springframework.beans.factory.config.BeanDefinition;
import com.lovegu.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
