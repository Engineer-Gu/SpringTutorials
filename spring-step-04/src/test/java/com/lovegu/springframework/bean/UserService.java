package com.lovegu.springframework.bean;

/**
 * @author 老顾
 * @description
 * @date 2023/1/12
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("").append(name);
        return stringBuilder.toString();
    }
}
