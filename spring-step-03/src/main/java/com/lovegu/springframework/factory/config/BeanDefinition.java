package com.lovegu.springframework.factory.config;

/**
 * @author 老顾
 * @description 将 Bean 对象的实例化放到容器中处理
 * @date 2023/1/12
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
