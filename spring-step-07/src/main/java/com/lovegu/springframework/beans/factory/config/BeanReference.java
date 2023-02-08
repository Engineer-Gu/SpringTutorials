package com.lovegu.springframework.beans.factory.config;

/**
 * @author 老顾
 * @description 类引用类
 * @date 2023/1/14
 */
public class BeanReference {

    private String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
