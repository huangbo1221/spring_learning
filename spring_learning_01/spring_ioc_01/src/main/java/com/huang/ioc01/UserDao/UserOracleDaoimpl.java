package com.huang.ioc01.UserDao;

/**
 * @ClassName UserOracleDaoimpl
 * @Description TODO
 * @Author huangbo1221
 * @Date 2021/12/31 23:26
 * @Version 1.0
 */
public class UserOracleDaoimpl implements UserDao{
    @Override
    public void getUsers() {
        System.out.println("use UserOracleDaoimpl!");
    }
}
