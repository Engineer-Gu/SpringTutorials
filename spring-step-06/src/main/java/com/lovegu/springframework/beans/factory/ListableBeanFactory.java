package com.lovegu.springframework.beans.factory;

import com.lovegu.springframework.beans.BeansException;

import java.util.Map;

/**
 * @author 老顾
 * @description 自动装配工厂接口
 * @date 2023/2/2
 */
public interface ListableBeanFactory extends BeanFactory{

    /**
     * 按照类型返回 Bean 实例
     *
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();

}
