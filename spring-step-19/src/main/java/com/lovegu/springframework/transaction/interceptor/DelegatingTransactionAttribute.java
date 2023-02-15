package com.lovegu.springframework.transaction.interceptor;



import com.lovegu.springframework.transaction.support.DelegatingTransactionDefinition;

import java.io.Serializable;

/**
 * @author zhangdd on 2022/2/27
 */
public abstract class DelegatingTransactionAttribute extends DelegatingTransactionDefinition implements TransactionAttribute, Serializable {

    private final TransactionAttribute targetAttribute;


    public DelegatingTransactionAttribute(TransactionAttribute targetAttribute) {
        super(targetAttribute);
        this.targetAttribute = targetAttribute;
    }


    @Override
    public boolean rollbackOn(Throwable ex) {
        return this.targetAttribute.rollbackOn(ex);
    }
}
