package com.lovegu.springframework.converter;


import com.lovegu.springframework.core.convert.converter.Converter;

/**
 *
 */
public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }

}
