package com.lovegu.springframework.context.support;

import com.lovegu.springframework.beans.factory.FactoryBean;
import com.lovegu.springframework.beans.factory.InitializingBean;
import com.lovegu.springframework.core.convert.ConversionService;
import com.lovegu.springframework.core.convert.converter.Converter;
import com.lovegu.springframework.core.convert.converter.ConverterFactory;
import com.lovegu.springframework.core.convert.converter.ConverterRegistry;
import com.lovegu.springframework.core.convert.converter.GenericConverter;
import com.lovegu.springframework.core.convert.support.DefaultConversionService;
import com.lovegu.springframework.core.convert.support.GenericConversionService;
import com.sun.istack.internal.Nullable;

import java.util.Set;

/**
 * @author 老顾
 * @description
 * @date 2023/2/15
 */
public class ConversionServiceFactoryBean implements FactoryBean<ConversionService>, InitializingBean {

    @Nullable
    private Set<?> converters;

    @Nullable
    private GenericConversionService conversionService;

    @Override
    public ConversionService getObject() throws Exception {
        return conversionService;
    }

    @Override
    public Class<?> getObjectType() {
        return conversionService.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.conversionService = new DefaultConversionService();
        registerConverters(converters, conversionService);
    }

    private void registerConverters(Set<?> converters, ConverterRegistry registry) {
        if (converters != null) {
            for (Object converter : converters) {
                if (converter instanceof GenericConverter) {
                    registry.addConverter((GenericConverter) converter);
                } else if (converter instanceof Converter<?, ?>) {
                    registry.addConverter((Converter<?, ?>) converter);
                } else if (converter instanceof ConverterFactory<?, ?>) {
                    registry.addConverterFactory((ConverterFactory<?, ?>) converter);
                } else {
                    throw new IllegalArgumentException("Each converter object must implement one of the " +
                            "Converter, ConverterFactory, or GenericConverter interfaces");
                }
            }
        }
    }

    public void setConverters(Set<?> converters) {
        this.converters = converters;
    }
}
