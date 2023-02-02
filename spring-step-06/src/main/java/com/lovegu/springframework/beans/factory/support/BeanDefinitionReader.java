package com.lovegu.springframework.beans.factory.support;

import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.core.io.Resource;
import com.lovegu.springframework.core.io.ResourceLoader;

/**
 * @author 老顾
 * @description Bean 对象定义读取接口
 * @date 2023/2/1
 */
public interface BeanDefinitionReader {

    // 获取注册的 bean
    BeanDefinitionRegistry getRegistry();

    // 获取资源的加载
    ResourceLoader getResourceLoader();

    // 加载bean对象的定义
    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
