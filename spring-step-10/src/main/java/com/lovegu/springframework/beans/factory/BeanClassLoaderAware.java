package com.lovegu.springframework.beans.factory;

import com.lovegu.springframework.beans.BeansException;

/**
 * @author 老顾
 * @description 容器感知类
 * @date 2023/2/9
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader) throws BeansException;
}
