package com.lovegu.springframework.beans.factory.config;

import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.beans.PropertyValues;

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

    /**
     * 在 Bean 对象实例化完成后，设置属性操作之前执行此方法
     *
     * @param pvs 属性值
     * @param bean 对象
     * @param beanName 对象名
     * @return 方法
     * @throws BeansException 自定义异常
     */
    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException;

}
