package com.huang.demo3.pojo;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/10 22:39
 * @Version 1.0
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("这是一个add方法");
    }

    @Override
    public void delete() {
        System.out.println("这是一个delete方法");
    }

    @Override
    public void update() {
        System.out.println("这是一个update方法");
    }

    @Override
    public void query() {
        System.out.println("这是一个query方法");
    }
}
