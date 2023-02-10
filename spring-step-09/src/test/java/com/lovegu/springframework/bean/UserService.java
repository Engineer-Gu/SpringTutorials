package com.lovegu.springframework.bean;

import com.lovegu.springframework.beans.BeansException;
import com.lovegu.springframework.beans.factory.BeanClassLoaderAware;
import com.lovegu.springframework.beans.factory.BeanFactory;
import com.lovegu.springframework.beans.factory.BeanFactoryAware;
import com.lovegu.springframework.beans.factory.BeanNameAware;
import com.lovegu.springframework.context.ApplicationContext;
import com.lovegu.springframework.context.ApplicationContextAware;

public class UserService {

    private String uId;
    private String company;
    private String location;
    private IUserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + "," + company + "," + location;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

}
