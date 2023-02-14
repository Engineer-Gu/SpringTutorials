package com.lovegu.springframework.bean;

import com.lovegu.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 老顾
 * @description
 * @date 2023/2/14
 */
@Component
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "老顾，四川，达州");
        hashMap.put("10002", "八杯水，上海，尖沙咀");
        hashMap.put("10003", "阿毛，香港，铜锣湾");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
