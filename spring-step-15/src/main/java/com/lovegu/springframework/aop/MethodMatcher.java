package com.lovegu.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author 老顾
 * @description
 * @date 2023/2/12
 */
public interface MethodMatcher {

    /**
     * 方法匹配用于找到表达式范围内的目标类和方法
     *
     * @param method 方法
     * @param targetClass 模板类
     * @return true 或 false
     */
    boolean matches(Method method, Class<?> targetClass);
}
