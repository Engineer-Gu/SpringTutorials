package com.lovegu.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 老顾
 * @description Bean对象工厂，将Bean存到Map里以便获取对象
 * @date 2023/1/12
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
