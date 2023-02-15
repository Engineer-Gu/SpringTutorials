package com.lovegu.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author 老顾
 * @description @Qualifier 和 @Autowired 搭配使用
 * @date 2023/2/14
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Qualifier {

    String value() default "";
}
