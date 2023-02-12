package com.lovegu.springframework.aop;

/**
 * @author 老顾
 * @description 定义切入点接口
 * @date 2023/2/12
 */
public interface Pointcut {

    /**
     * 获取当前切入点的类过滤器
     *
     * @return 类过滤器
     */
    ClassFilter getClassFilter();

    /**
     * 获取当前切入点的方法规则
     *
     * @return 方法规则
     */
    MethodMatcher getMethodMatcher();
}
