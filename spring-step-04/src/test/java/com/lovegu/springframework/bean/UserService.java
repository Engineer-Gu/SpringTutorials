package com.lovegu.springframework.bean;

/**
 * @author 老顾
 * @description 用户类
 * @date 2023/1/12
 */
public class UserService {

    private String uId;

    private UserDao userDao;


    public void queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(uId));
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
