package com.lovegu.springframework.beans.factory;

/**
 * @author 老顾
 * @description 定义销毁 Bean 对象的接口
 * @date 2023/2/8
 */
public interface DisposableBean {

    /**
     * 在 Bean 对象销毁时调用
     *
     * @throws Exception
     */
    void destroy() throws Exception;
}
