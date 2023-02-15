package com.lovegu.springframework.core.convert.converter;

/**
 * @author 老顾
 * @description 类型转换注册接口
 * @date 2023/2/15
 */
public interface ConverterRegistry {

    void addConverter(Converter<?, ?> converter);

    void addConverter(GenericConverter converter);

    void addConverterFactory(ConverterFactory<?, ?> converterFactory);

}
