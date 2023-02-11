package com.lovegu.springframework.context.event;

import com.lovegu.springframework.context.ApplicationEvent;
import com.lovegu.springframework.context.ApplicationListener;

/**
 * @author 老顾
 * @description 事件广播器
 * @date 2023/2/11
 */
public interface ApplicationEventMulticaster {

    /**
     * 添加所有事件的监听器
     *
     * @param listener 监听器
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * 移除所有事件的监听器
     *
     * @param listener 监听器
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * 将给定的应用程序事件广播到监听器
     *
     * @param event 事件
     */
    void multicastEvent(ApplicationEvent event);
}
