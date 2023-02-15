package com.lovegu.springframework.context;

import java.util.EventListener;

/**
 * @author 老顾
 * @description 监听事件接口
 * @date 2023/2/11
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * 开启应用事件
     *
     * @param event 事件
     */
    void onApplicationEvent(E event);
}
