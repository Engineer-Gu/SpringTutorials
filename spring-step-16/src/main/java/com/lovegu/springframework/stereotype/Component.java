package com.lovegu.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @author 老顾
 * @description 使用 Component 进行自定义注解
 * @date 2023/2/13
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";
}
