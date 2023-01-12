package com.lovegu.springframework;

import com.lovegu.springframework.bean.UserService;
import com.lovegu.springframework.factory.config.BeanDefinition;
import com.lovegu.springframework.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author 老顾
 * @description
 * @date 2023/1/12
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {

        // 初始化 beanFactory 接口
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        // 注册 bean 对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        defaultListableBeanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取 bean 对象
        UserService userService = (UserService) defaultListableBeanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService userService_singleton = (UserService) defaultListableBeanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
