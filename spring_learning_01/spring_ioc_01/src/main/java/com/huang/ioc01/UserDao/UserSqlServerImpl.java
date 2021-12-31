package com.huang.ioc01.UserDao;

/**
 * @ClassName UserSqlServerImpl
 * @Description TODO
 * @Author huangbo1221
 * @Date 2021/12/31 23:12
 * @Version 1.0
 */
public class UserSqlServerImpl implements UserDao{
    @Override
    public void getUsers() {
        System.out.println("use UserSqlServerImpl!");
    }
}
