package com.lovegu.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author 老顾
 * @description 在方法前拦截
 * @date 2023/2/13
 */
public interface MethodBeforeAdvice extends BeforeAdvice{

    /**
     * 方法前
     *
     * @param method 方法
     * @param args 参数
     * @param target 目标对象
     * @throws Throwable 异常
     */
    void before(Method method, Object[] args, Object target) throws Throwable;
}
