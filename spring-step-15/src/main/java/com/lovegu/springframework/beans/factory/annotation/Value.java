package com.lovegu.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author 老顾
 * @description
 * @date 2023/2/14
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    String value();
}
