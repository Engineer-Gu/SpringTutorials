package com.lovegu.springframework.util;

/**
 * @author 老顾
 * @description 解析字符串操作的接口
 * @date 2023/2/14
 */
public interface StringValueResolver {

    /**
     * 解析字符串值
     *
     * @param strVal 字符串
     * @return 属性值
     */
    String resolveStringValue(String strVal);
}
