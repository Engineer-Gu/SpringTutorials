package com.lovegu.springframework;

import com.lovegu.springframework.bean.UserDao;
import com.lovegu.springframework.bean.UserService;
import com.lovegu.springframework.factory.config.BeanDefinition;
import com.lovegu.springframework.factory.config.BeanReference;
import com.lovegu.springframework.factory.support.DefaultListableBeanFactory;
import org.testng.annotations.Test;


/**
 * @author 老顾
 * @description
 * @date 2023/1/14
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {

        // 初始化 BeanFactory 接口
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注册 UserDao
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 使用 UserService 填充属性(uId、userDao)
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId","001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 使用 UserService 注册 Bean 对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 使用 UserService 获取Bean 对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
