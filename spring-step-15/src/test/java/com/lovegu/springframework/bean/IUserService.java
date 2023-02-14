package com.lovegu.springframework.bean;

/**
 * @author 老顾
 * @description
 * @date 2023/2/12
 */
public interface IUserService {

    String queryUserInfo();

    String register(String userName);
}
