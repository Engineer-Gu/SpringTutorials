package com.lovegu.springframework.factory.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 老顾
 * @description 实现单例对象的方法，获取单例对象和注册单例对象
 * @date 2023/1/12
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry{

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
