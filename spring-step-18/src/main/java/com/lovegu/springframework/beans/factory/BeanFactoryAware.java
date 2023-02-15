package com.lovegu.springframework.beans.factory;

import com.lovegu.springframework.beans.BeansException;

/**
 * @author 老顾
 * @description 实现此接口，既能感知到所属的 BeanFactory
 * @date 2023/2/9
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
