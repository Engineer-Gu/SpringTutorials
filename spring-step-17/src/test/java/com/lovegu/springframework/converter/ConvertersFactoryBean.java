package com.lovegu.springframework.converter;


import com.lovegu.springframework.beans.factory.FactoryBean;

import java.util.HashSet;
import java.util.Set;

/**
 * 转换工厂类
 */
public class ConvertersFactoryBean implements FactoryBean<Set<?>> {

	@Override
	public Set<?> getObject() throws Exception {
		HashSet<Object> converters = new HashSet<>();
		StringToLocalDateConverter stringToLocalDateConverter = new StringToLocalDateConverter("yyyy-MM-dd");
		converters.add(stringToLocalDateConverter);
		return converters;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
