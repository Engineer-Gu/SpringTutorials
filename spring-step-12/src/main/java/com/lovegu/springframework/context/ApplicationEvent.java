package com.lovegu.springframework.context;

import java.util.EventObject;

/**
 * @author 老顾
 * @description 事件应用类
 * @date 2023/2/11
 */
public class ApplicationEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
