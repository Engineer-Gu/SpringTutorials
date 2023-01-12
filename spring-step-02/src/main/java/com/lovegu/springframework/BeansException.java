package com.lovegu.springframework;

/**
 * @author 老顾
 * @description
 * @date 2023/1/12
 */
public class BeansException  extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
