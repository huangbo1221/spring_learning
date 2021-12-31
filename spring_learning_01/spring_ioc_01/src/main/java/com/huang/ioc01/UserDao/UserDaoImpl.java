package com.huang.ioc01.UserDao;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author huangbo1221
 * @Date 2021/12/31 22:55
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void getUsers() {
        System.out.println("use UserDaoImpl!");
    }
}
