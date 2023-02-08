package com.lovegu.springframework.io;

/**
 * @author 老顾
 * @description 定义获取资源的接口，在接口中传递资源地址
 * @date 2023/1/18
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
