package com.huang.ioc01.UserService;

import com.huang.ioc01.UserDao.UserDao;
import com.huang.ioc01.UserDao.UserDaoImpl;
import com.huang.ioc01.UserDao.UserMybatisImpl;
import com.huang.ioc01.UserDao.UserSqlServerImpl;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author huangbo1221
 * @Date 2021/12/31 22:56
 * @Version 1.0
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUsers() {
        userDao.getUsers();
    }
}
