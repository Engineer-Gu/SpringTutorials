package com.lovegu.springframework;

import com.lovegu.springframework.bean.IUserService;
import com.lovegu.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

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
