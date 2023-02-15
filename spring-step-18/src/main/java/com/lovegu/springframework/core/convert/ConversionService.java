package com.lovegu.springframework.core.convert;

import com.sun.istack.internal.Nullable;

/**
 * @author 老顾
 * @description 转换服务接口
 * @date 2023/2/15
 */
public interface ConversionService {

    boolean canConvert(@Nullable Class<?> sourceType, Class<?> targetType);

    <T> T convert(Object source, Class<T> targetType);
}
