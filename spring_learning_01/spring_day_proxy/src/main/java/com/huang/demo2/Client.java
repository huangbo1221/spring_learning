package com.huang.demo2;

import org.junit.Test;

/**
 * @ClassName Client
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/10 22:23
 * @Version 1.0
 */
public class Client {
    @Test
    public void test01() {
        Landlord landlord = new Landlord();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(landlord);
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();
    }
}
