package com.lovegu.springframework.context.annotation;

import cn.hutool.core.util.ClassUtil;
import com.lovegu.springframework.beans.factory.config.BeanDefinition;
import com.lovegu.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 老顾
 * @description 处理对象地址扫描装配
 * @date 2023/2/13
 */
public class ClassPathScanningCandidateComponentProvider {

    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }
}
