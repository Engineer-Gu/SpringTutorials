package com.lovegu.springframework.core.convert.support;

import com.lovegu.springframework.core.convert.converter.ConverterRegistry;

/**
 * @author 老顾
 * @description
 * @date 2023/2/15
 */
public class DefaultConversionService extends GenericConversionService{

    public DefaultConversionService() {
        addDefaultConverters(null);
    }

    private static void addDefaultConverters(ConverterRegistry converterRegistry) {
        // 添加各类类型转换工厂
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
    }
}
