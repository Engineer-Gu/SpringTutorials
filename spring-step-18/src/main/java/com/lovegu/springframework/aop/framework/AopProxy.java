package com.lovegu.springframework.aop.framework;

/**
 * @author 老顾
 * @description 切面代理类
 * @date 2023/2/12
 */
public interface AopProxy {

    /**
     * 获取代理类
     *
     * @return 代理类
     */
    Object getProxy();
}
