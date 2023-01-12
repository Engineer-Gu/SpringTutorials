package com.lovegu.springframework;

import com.lovegu.springframework.bean.UserService;
import org.junit.Test;

/**
 * @author 老顾
 * @description
 * @date 2023/1/12
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化BeanFactory接口
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册bean对象
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 Bean 对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
