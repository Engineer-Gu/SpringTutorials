package com.lovegu.springframework.event;

import com.lovegu.springframework.context.ApplicationListener;
import com.lovegu.springframework.context.event.ContextClosedEvent;

/**
 * @author 老顾
 * @description
 * @date 2023/2/11
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + event.getClass().getName());
    }
}
