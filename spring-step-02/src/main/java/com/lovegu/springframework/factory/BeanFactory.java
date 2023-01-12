package com.lovegu.springframework.factory;

/**
 * @author 老顾
 * @description bean 工厂
 * @date 2023/1/12
 */
public interface BeanFactory {

    Object getBean(String name);
}
