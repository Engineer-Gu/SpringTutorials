package com.lovegu.springframework.context;


import com.lovegu.springframework.beans.factory.HierarchicalBeanFactory;
import com.lovegu.springframework.beans.factory.ListableBeanFactory;
import com.lovegu.springframework.core.io.ResourceLoader;

/**
 * 应用上下文
 */
public interface ApplicationContext extends  ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
