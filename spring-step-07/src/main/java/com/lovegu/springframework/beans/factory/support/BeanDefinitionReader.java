package com.lovegu.springframework.beans.factory.support;


import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.core.io.Resource;
import com.lovegu.springframework.core.io.ResourceLoader;

/**
 * Bean 对象定义读取接口
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
