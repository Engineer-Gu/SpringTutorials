package com.lovegu.springframework.aop.support;


import com.lovegu.springframework.aop.ClassFilter;
import com.lovegu.springframework.aop.MethodMatcher;
import com.lovegu.springframework.aop.Pointcut;

/**
 * @author zhangdd on 2022/2/27
 */
public abstract class StaticMethodMatcherPointcut extends StaticMethodMatcher implements Pointcut {

    private ClassFilter classFilter = ClassFilter.TRUE;

    public void setClassFilter(ClassFilter classFilter) {
        this.classFilter = classFilter;
    }

    public ClassFilter getClassFilter() {
        return classFilter;
    }

    @Override
    public MethodMatcher getMethodMatcher() {
        return this;
    }
}
