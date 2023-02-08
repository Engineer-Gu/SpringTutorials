package com.lovegu.springframework.context;

import com.lovegu.springframework.beans.BeansException;

/**
 * @author 老顾
 * @description 应用上下文配置接口
 * @date 2023/2/2
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
