package com.lovegu.springframework.transaction.interceptor;


import com.lovegu.springframework.transaction.TransactionDefinition;

/**
 * @author zhangdd on 2022/2/26
 */
public interface TransactionAttribute extends TransactionDefinition {

    boolean rollbackOn(Throwable ex);
}
