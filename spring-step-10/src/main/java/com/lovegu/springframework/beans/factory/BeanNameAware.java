package com.lovegu.springframework.beans.factory;

/**
 * @author 老顾
 * @description 感知 Bean 对象的名称
 * @date 2023/2/9
 */
public interface BeanNameAware extends Aware{

    void setBeanName(String name);
}
