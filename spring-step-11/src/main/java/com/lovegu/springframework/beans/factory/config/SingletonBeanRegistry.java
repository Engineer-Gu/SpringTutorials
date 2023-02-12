package com.lovegu.springframework.beans.factory.config;

/**
 * 定义一个注册和获取单例对象的接口
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}
                                                