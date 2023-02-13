package com.lovegu.springframework.beans.factory;

/**
 * @author 老顾
 * @description 定义工厂对象接口
 * @date 2023/2/10
 */
public interface FactoryBean<T> {

    /**
     * 获取对象
     *
     * @return 对象
     * @throws Exception 异常
     */
    T getObject() throws Exception;

    /**
     * 获取对象类型
     *
     * @return 对象类型
     */
    Class<?> getObjectType();

    /**
     * 是否是单例对象
     *
     * @return 单例对象
     */
    boolean isSingleton();
}
