package com.lovegu.springframework.beans.factory.config;

import com.lovegu.springframework.beans.BeansException;

/**
 * @author 老顾
 * @description 提供 BeanPostProcessor 接口可以修改新实例化 Bean 对象的扩展点
 * @date 2023/2/2
 */
public interface BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
