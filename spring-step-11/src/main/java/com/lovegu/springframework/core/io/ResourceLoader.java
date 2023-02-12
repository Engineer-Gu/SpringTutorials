package com.lovegu.springframework.core.io;

/**
 * 定义获取资源的接口，在接口中传递资源地址
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
