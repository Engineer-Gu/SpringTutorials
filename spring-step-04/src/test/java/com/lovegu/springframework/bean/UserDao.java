package com.lovegu.springframework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 老顾
 * @description 测试用例准备
 * @date 2023/1/14
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {

        hashMap.put("001", "老顾");
        hashMap.put("002", "老张");
        hashMap.put("003", "老王");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
