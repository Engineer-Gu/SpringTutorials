package com.lovegu.springframework.context.event;

import com.lovegu.springframework.context.ApplicationEvent;

/**
 * @author 老顾
 * @description 监听和关闭事件
 * @date 2023/2/11
 */
public class ContextClosedEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
