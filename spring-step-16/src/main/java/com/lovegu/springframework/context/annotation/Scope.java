package com.lovegu.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @author 老顾
 * @description 定义拦截注解
 * @date 2023/2/13
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";
}
