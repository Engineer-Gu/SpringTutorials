package com.lovegu.springframework.context.support;

import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.lovegu.springframework.beans.factory.config.BeanFactoryPostProcessor;
import com.lovegu.springframework.beans.factory.config.BeanPostProcessor;
import com.lovegu.springframework.context.ConfigurableApplicationContext;
import com.lovegu.springframework.core.io.DefaultResourceLoader;

import java.util.Map;

/**
 * @author 老顾
 * @description 应用上下文抽象类实现
 * @date 2023/2/2
 */
public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {


    public void refresh() throws BeansException {

        // 1.创建 BeanFactory,并加载 BeanDefinition
        refreshBeanFactory();

        // 2.获取 BeanFactory
        ConfigurableListableBeanFactory beanFactory = getBeanFactory();

        // 3.在将 Bean 对象实例化之前，执行 BeanFactoryPostProcessor 操作
        invokeBeanFactoryPostProcessors(beanFactory);

        // 4. BeanPostProcessor 需要再将 Bean 对象实例化之前注册
        registerBeanPostProcessors(beanFactory);

        // 5.提前实例化单例 Bean 对象
        beanFactory.preInstantiateSingletons();
    }

    protected abstract void refreshBeanFactory() throws BeansException;

    protected abstract ConfigurableListableBeanFactory getBeanFactory();
    private void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanFactoryPostProcessor> beanFactoryPostProcessorMap =
                beanFactory.getBeansOfType(BeanFactoryPostProcessor.class);
        for (BeanFactoryPostProcessor beanFactoryPostProcessor : beanFactoryPostProcessorMap.values()) {
            beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        }
    }

    private void registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanPostProcessor> beanPostProcessorMap =
                beanFactory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorMap.values()) {
            beanFactory.addBeanPostProcessor(beanPostProcessor);
        }
    }

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        return getBeanFactory().getBeansOfType(type);
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return getBeanFactory().getBeanDefinitionNames();
    }

    @Override
    public Object getBean(String name) throws BeansException {
        return getBeanFactory().getBean(name);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return getBeanFactory().getBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return getBeanFactory().getBean(name, requiredType);
    }
}
