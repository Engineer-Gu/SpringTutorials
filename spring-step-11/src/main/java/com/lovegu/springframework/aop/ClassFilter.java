package com.lovegu.springframework.aop;

/**
 * @author 老顾
 * @description 过滤器，限制切入点的匹配或对给定目标类的引入
 * @date 2023/2/12
 */
public interface ClassFilter {

    /**
     * 是否匹配
     * @param clazz 类
     * @return true 或 false
     */
    boolean matches(Class<?> clazz);
}
