package com.lovegu.springframework.beans.factory;

/**
 * @author 老顾
 * @description 定义初始化 Bean 对象的接口
 * @date 2023/2/8
 */
public interface InitializingBean {

    /**
     * 在 Bean 对象属性填充完成后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}
