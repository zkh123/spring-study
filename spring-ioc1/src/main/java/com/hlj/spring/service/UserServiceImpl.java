package com.hlj.spring.service;

import com.hlj.spring.dao.UserDao;
import com.hlj.spring.dao.UserDaoImpl;

/**
 * @author jingzhidematong
 * @date 2021/2/7
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao = new UserDaoImpl();

    public void getUser() {
        userDao.getUser();
    }
}
