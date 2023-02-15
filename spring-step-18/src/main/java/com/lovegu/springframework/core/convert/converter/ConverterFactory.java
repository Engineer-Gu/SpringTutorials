package com.lovegu.springframework.core.convert.converter;

/**
 * @author 老顾
 * @description 定义类型转换工厂
 * @date 2023/2/15
 */
public interface ConverterFactory<S, R> {

    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}
