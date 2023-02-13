package com.lovegu.springframework.aop;

import org.aspectj.weaver.Advice;

/**
 * @author 老顾
 * @description 定义 Advisor 访问者
 * @date 2023/2/13
 */
public interface Advisor {

    /**
     * 获取拦截器
     *
     * @return 拦截器
     */
    Advice getAdvice();
}
