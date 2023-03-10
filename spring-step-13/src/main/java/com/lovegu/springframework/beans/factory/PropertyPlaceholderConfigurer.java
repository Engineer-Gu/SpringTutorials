package com.lovegu.springframework.beans.factory;

import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.beans.PropertyValue;
import com.lovegu.springframework.beans.PropertyValues;
import com.lovegu.springframework.beans.factory.config.BeanDefinition;
import com.lovegu.springframework.beans.factory.config.BeanFactoryPostProcessor;
import com.lovegu.springframework.core.io.DefaultResourceLoader;
import com.lovegu.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Properties;


/**
 * @author 老顾
 * @description 处理占位符配置
 * @date 2023/2/13
 */
public class PropertyPlaceholderConfigurer implements BeanFactoryPostProcessor {

    /**
     * 默认占位符前缀: {@value}
     */
    public static final String DEFAULT_PLACEHOLDER_PREFIX = "${";

    /**
     * 默认占位符后缀: {@value}
     */
    public static final String DEFAULT_PLACEHOLDER_SUFFIX = "}";

    private String location;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // 加载属性文件
        try {
            DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
            Resource resource = resourceLoader.getResource(location);
            Properties properties = new Properties();
            properties.load(resource.getInputStream());

            String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
            for (String beanName : beanDefinitionNames) {
                BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);

                PropertyValues propertyValues = beanDefinition.getPropertyValues();
                for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                    Object value = propertyValue.getValue();
                    if (!(value instanceof String)) continue;
                    String strVal = (String) value;
                    StringBuilder buffer = new StringBuilder(strVal);
                    int startIdx = strVal.indexOf(DEFAULT_PLACEHOLDER_PREFIX);
                    int stopIdx = strVal.indexOf(DEFAULT_PLACEHOLDER_SUFFIX);
                    if (startIdx != -1 && stopIdx != -1 && startIdx < stopIdx) {
                        String propKey = strVal.substring(startIdx + 2, stopIdx);
                        String propVal = properties.getProperty(propKey);
                        buffer.replace(startIdx, stopIdx + 1, propVal);
                        propertyValues.addPropertyValue(new PropertyValue(propertyValue.getName(), buffer.toString()));
                    }
                }
            }
        }catch (IOException e) {
            throw new BeansException("Cloud not load properties", e);
        }
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
