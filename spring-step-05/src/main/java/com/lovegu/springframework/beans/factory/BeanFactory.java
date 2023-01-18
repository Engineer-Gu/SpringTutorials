package com.lovegu.springframework.beans.factory;

import com.lovegu.springframework.beans.BeansException;

/**
 * @author 老顾
 * @description bean 工厂
 * @date 2023/1/12
 */
public interface BeanFactory {

    Object getBean(String name);

    Object getBean(String name, Object... args) throws BeansException;
}
