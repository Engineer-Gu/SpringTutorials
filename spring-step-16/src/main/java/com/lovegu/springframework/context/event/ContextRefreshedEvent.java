package com.lovegu.springframework.context.event;

import com.lovegu.springframework.context.ApplicationEvent;

/**
 * @author 老顾
 * @description 刷新事件
 * @date 2023/2/11
 */
public class ContextRefreshedEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
