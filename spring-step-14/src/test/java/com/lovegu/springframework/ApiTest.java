package com.lovegu.springframework;

import com.lovegu.springframework.bean.IUserService;
import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.beans.factory.config.BeanPostProcessor;
import com.lovegu.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 老顾
 * @description
 * @date 2023/2/13
 */
public class ApiTest {

    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }
}
