package com.lovegu.springframework.context;

/**
 * @author 老顾
 * @description 事件发布者接口
 * @date 2023/2/11
 */
public interface ApplicationEventPublisher {

    /**
     * 所有事件都要从这个接口中发布出去
     *
     * @param event 事件
     */
    void publishEvent(ApplicationEvent event);
}
