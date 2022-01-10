package com.huang.demo3;

import com.huang.demo3.pojo.UserService;
import com.huang.demo3.pojo.UserServiceImpl;
import org.junit.Test;

/**
 * @ClassName Client
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/10 22:46
 * @Version 1.0
 */
public class Client {
    @Test
    public void test1() {
        UserServiceImpl userService = new UserServiceImpl(); // 真实的用户角色，需要被代理
        // 代理角色，不存在
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        // 设置需要代理的对象
        proxyInvocationHandler.setObject(userService);
        // 动态生成代理类
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.add();
    }
}
