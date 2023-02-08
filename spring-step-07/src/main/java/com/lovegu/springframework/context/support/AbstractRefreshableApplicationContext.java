package com.lovegu.springframework.context.support;

import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.lovegu.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author 老顾
 * @description 获取 Bean 工厂和加载资源
 * @date 2023/2/2
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
