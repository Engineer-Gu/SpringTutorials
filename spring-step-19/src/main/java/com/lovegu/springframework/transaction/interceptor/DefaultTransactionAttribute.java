package com.lovegu.springframework.transaction.interceptor;


import com.lovegu.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @author zhangdd on 2022/2/26
 */
public class DefaultTransactionAttribute extends DefaultTransactionDefinition implements TransactionAttribute {


    public DefaultTransactionAttribute() {
        super();
    }


    @Override
    public boolean rollbackOn(Throwable ex) {
        return (ex instanceof RuntimeException || ex instanceof Error);
    }

    @Override
    public String toString() {
        return "DefaultTransactionAttribute{}";
    }
}
