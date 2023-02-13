package com.lovegu.springframework.aop.aspectj;

import com.lovegu.springframework.aop.Pointcut;
import com.lovegu.springframework.aop.PointcutAdvisor;
import org.aspectj.weaver.Advice;

/**
 * @author 老顾
 * @description 切面拦截器实现
 * @date 2023/2/13
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    // 切面
    private AspectJExpressionPointcut pointcut;

    // 具体的拦截方法
    private Advice advice;

    // 表达式
    private String expression;

    public void setExpression(String expression){
        this.expression = expression;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        if (null == pointcut) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }
}
