package com.lovegu.springframework.bean;

import com.lovegu.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author 老顾
 * @description
 * @date 2023/2/14
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法：" + method.getName());
    }
}
