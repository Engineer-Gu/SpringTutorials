package com.lovegu.springframework.beans.factory.config;


import com.lovegu.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * 由大多数 bean 工厂实现的配置接口
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();
}
