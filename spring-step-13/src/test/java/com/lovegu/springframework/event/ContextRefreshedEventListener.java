package com.lovegu.springframework.event;

import com.lovegu.springframework.context.ApplicationListener;
import com.lovegu.springframework.context.event.ContextRefreshedEvent;

/**
 * @author 老顾
 * @description 刷新事件监听器实现
 * @date 2023/2/11
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + this.getClass().getName());
    }
}
