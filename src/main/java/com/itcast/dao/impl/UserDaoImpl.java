package com.itcast.dao.impl;

import com.itcast.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDao的save方法执行了。。。。。。。。。。");
    }
}
