package com.lovegu.springframework.context;


import com.lovegu.springframework.beans.BeansException;

/**
 * 应用上下文配置接口
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();

}
