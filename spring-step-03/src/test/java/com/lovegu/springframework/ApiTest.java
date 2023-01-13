package com.lovegu.springframework;

import com.lovegu.springframework.bean.UserService;
import com.lovegu.springframework.factory.config.BeanDefinition;
import com.lovegu.springframework.factory.support.DefaultListableBeanFactory;
import org.testng.annotations.Test;

/**
 * @author 老顾
 * @description
 * @date 2023/1/12
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {

        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 3. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 4.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "老顾");
        userService.queryUserInfo();
    }
}
