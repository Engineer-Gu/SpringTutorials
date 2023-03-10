package com.lovegu.springframework.transaction.annotation;



import com.lovegu.springframework.transaction.interceptor.TransactionAttribute;

import java.lang.reflect.AnnotatedElement;

/**
 * @author zhangdd on 2022/2/26
 */
public interface TransactionAnnotationParser {

    /**
     * 解析 事务注解
     */
    TransactionAttribute parseTransactionAnnotation(AnnotatedElement element);
}
