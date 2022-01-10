package com.huang.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyInvocationHandler
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/10 22:19
 * @Version 1.0
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        lookForHouse();
        // 动态代理的本质，就是使用反射机制实现
        Object invoke = method.invoke(rent, args);
        sign();
        giveMoney();
        return invoke;
    }

    private void lookForHouse() {
        System.out.println("中介带你看房子！");
    }

    private void sign() {
        System.out.println("中介帮你签合同！");
    }

    private void giveMoney() {
        System.out.println("缴费给中介！");
    }
}
