package com.lovegu.springframework.aop;

/**
 * @author 老顾
 * @description 切面拦截器接口
 * @date 2023/2/13
 */
public interface PointcutAdvisor extends Advisor{

    /**
     * 获取 JoinPoint
     *
     * @return 切入点
     */
    Pointcut getPointcut();
}
