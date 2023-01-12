package com.lovegu.springframework.factory.config;

/**
 * @author 老顾
 * @description 定义一个注册和获取单例对象的接口
 * @date 2023/1/12
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}
