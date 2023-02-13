package com.lovegu.springframework.event;

import com.lovegu.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @author 老顾
 * @description
 * @date 2023/2/11
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + " 消息时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }
}
