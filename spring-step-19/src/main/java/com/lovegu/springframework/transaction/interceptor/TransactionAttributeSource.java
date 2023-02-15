package com.lovegu.springframework.transaction.interceptor;

import java.lang.reflect.Method;

/**
 * @author zhangdd on 2022/2/26
 */
public interface TransactionAttributeSource {

    TransactionAttribute getTransactionAttribute(Method method, Class<?> targetClass);

}
