package com.lovegu.springframework.beans.factory.config;

import com.lovegu.springframework.beans.BeansException;

/**
 * @author 老顾
 * @description
 * @date 2023/2/13
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     *
     * @param beanClass 对象
     * @param beanName 对象名
     * @return 方法
     * @throws BeansException 自定义异常
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

}
