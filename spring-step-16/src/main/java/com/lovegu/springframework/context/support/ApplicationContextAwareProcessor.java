package com.lovegu.springframework.context.support;

import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.beans.factory.config.BeanPostProcessor;
import com.lovegu.springframework.context.ApplicationContext;
import com.lovegu.springframework.context.ApplicationContextAware;

/**
 * @author 老顾
 * @description 包装处理类
 * @date 2023/2/9
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
