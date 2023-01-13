package com.lovegu.springframework.factory.support;

import com.lovegu.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author 老顾
 * @description 创建 bean 对象
 * @date 2023/1/12
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiation();
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        // 完成实例化后，将单例对象存到集合缓存中
        registerSingleton(beanName, bean);
        return bean;
    }

    // 创建基于策略模式的调用
    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUser = null;
        Class<?> clazz = beanDefinition.getBeanClass();
        // 获取所有构造函数，形成一个集合
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        // 循环比对构造函数和入参信息 args 的匹配情况，这里只比对数量
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            if (args != null && declaredConstructor.getParameterTypes().length == args.length) {
                constructorToUser  = declaredConstructor;
                break;
            }
        }
        return instantiationStrategy.instantiate(beanDefinition, beanName, constructorToUser,args);
    }
}
