package com.lovegu.springframework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 老顾
 * @description
 * @date 2023/2/1
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "老顾");
        hashMap.put("10002", "老张");
        hashMap.put("10003", "老王");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
