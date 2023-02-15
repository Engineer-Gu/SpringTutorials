package com.lovegu.springframework.beans.factory;

import com.lovegu.springframework.beans.BeansException;

/**
 * @author 老顾
 * @description
 * @date 2023/2/15
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}
