package com.lovegu.springframework.context.support;

import com.lovegu.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.lovegu.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author 老顾
 * @description 上下文中对配置信息的加载
 * @date 2023/2/2
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
