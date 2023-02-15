package com.lovegu.springframework.core.convert.converter;

/**
 * @author 老顾
 * @description 定义类型转换处理接口
 * @date 2023/2/15
 */
public interface Converter<S, T> {


    T convert(S source);
}
