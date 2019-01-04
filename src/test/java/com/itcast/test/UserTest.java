package com.itcast.test;

import com.itcast.dao.UserDao;
import com.itcast.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void UserSaveTest(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.save();
    }
}
