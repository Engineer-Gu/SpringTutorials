package com.lovegu.springframework.transaction.annotation;


import com.lovegu.springframework.core.annotation.AnnotatedElementUtils;
import com.lovegu.springframework.core.annotation.AnnotationAttributes;
import com.lovegu.springframework.transaction.interceptor.RollbackRuleAttribute;
import com.lovegu.springframework.transaction.interceptor.RuleBasedTransactionAttribute;
import com.lovegu.springframework.transaction.interceptor.TransactionAttribute;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangdd on 2022/2/26
 */
public class SpringTransactionAnnotationParser implements TransactionAnnotationParser, Serializable {


    @Override
    public TransactionAttribute parseTransactionAnnotation(AnnotatedElement element) {
        AnnotationAttributes attributes = AnnotatedElementUtils.findMergedAnnotationAttributes(
                element, Transactional.class, false, false);
        if (null != attributes) {
            return parseTransactionAnnotation(attributes);
        } else {
            return null;
        }

    }

    protected TransactionAttribute parseTransactionAnnotation(AnnotationAttributes attributes) {
        RuleBasedTransactionAttribute rbta = new RuleBasedTransactionAttribute();

        List<RollbackRuleAttribute> rollbackRules = new ArrayList<>();
        for (Class<?> rbRule : attributes.getClassArray("rollbackFor")) {
            rollbackRules.add(new RollbackRuleAttribute(rbRule));
        }

        rbta.setRollbackRules(rollbackRules);
        return rbta;
    }
}
