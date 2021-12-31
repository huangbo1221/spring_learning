package com.huang.ioc01.UserDao;

/**
 * @ClassName UserMybatisImpl
 * @Description TODO
 * @Author huangbo1221
 * @Date 2021/12/31 23:08
 * @Version 1.0
 */
public class UserMybatisImpl implements UserDao{
    @Override
    public void getUsers() {
        System.out.println("use UserMybatisImpl!");
    }
}
