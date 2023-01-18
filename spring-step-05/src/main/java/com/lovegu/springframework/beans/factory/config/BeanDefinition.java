package com.lovegu.springframework.beans.factory.config;

import com.lovegu.springframework.beans.PropertyValues;

/**
 * @author 老顾
 * @description 将 Bean 对象的实例化放到容器中处理
 * @date 2023/1/12
 */
public class BeanDefinition {

    private Class beanClass;

    private final PropertyValues propertyValues;
    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues !=null ?propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }
}
