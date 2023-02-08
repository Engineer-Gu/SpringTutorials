package com.lovegu.springframework.beans.factory;

/**
 * 定义销毁 Bean 对象的接口
 */
public interface DisposableBean {

    void destroy() throws Exception;

}
