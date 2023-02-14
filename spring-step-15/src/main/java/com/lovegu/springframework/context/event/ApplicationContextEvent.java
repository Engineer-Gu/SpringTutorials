package com.lovegu.springframework.context.event;

import com.lovegu.springframework.context.ApplicationContext;
import com.lovegu.springframework.context.ApplicationEvent;

/**
 * @author 老顾
 * @description 应用上下文事件
 * @date 2023/2/11
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * 获取引发事件的应用上下文
     *
     * @return 应用上下文
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
