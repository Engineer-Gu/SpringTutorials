package com.lovegu.springframework;

import com.lovegu.springframework.bean.Husband;
import com.lovegu.springframework.bean.Wife;
import com.lovegu.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @author 老顾
 * @description
 * @date 2023/2/13
 */
public class ApiTest {

    @Test
    public void test_circular() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println("老公的媳妇：" + husband.queryWife());
        System.out.println("媳妇的老公：" + wife.queryHusband());
    }
}
