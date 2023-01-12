package com.lovegu.springframework;

/**
 * @author 老顾
 * @description 定义bean对象，以Object去存储对象
 * @date 2023/1/12
 */
public class BeanDefinition {

    private final Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
