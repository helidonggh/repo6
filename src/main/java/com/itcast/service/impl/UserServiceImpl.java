package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
//    private String name;
//    private Integer age;
//    private Date birthday;
    private Map<String,Object> map;
//
//    public UserServiceImpl(UserDao userDao,String name,Integer age,Date birthday,List<String> list){
//        this.userDao = userDao;
//        this.name = name;
//        this.age = age;
//        this.birthday = birthday;
//        this.list = list;
//    }
//
//    public UserServiceImpl() {
//    }
//
    public void setMap(Map<String,Object> map) {
        this.map = map;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
    @Override
    public void save() {
        System.out.println("userService的save方法执行了。。。。。。。。。。");
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("bean.xml");
        userDao = (UserDao) ca.getBean("userDao");
        userDao.save();
    }
    public void init(){
        System.out.println("初始化方法执行。。。。");
    }
    public void destroy(){
        System.out.println("对象已经被销毁。。。。。");
    }
}
