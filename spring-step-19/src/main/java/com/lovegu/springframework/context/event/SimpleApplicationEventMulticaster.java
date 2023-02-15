package com.lovegu.springframework.context.event;

import com.lovegu.springframework.beans.factory.BeanFactory;
import com.lovegu.springframework.context.ApplicationEvent;
import com.lovegu.springframework.context.ApplicationListener;

/**
 * @author 老顾
 * @description 简单事件广播器
 * @date 2023/2/11
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster{

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
