package com.huang.demo3;

import com.huang.demo2.Rent;

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
// 一个通用的代理类
public class ProxyInvocationHandler implements InvocationHandler {

    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    // 生成得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        // 动态代理的本质，就是使用反射机制实现
        Object invoke = method.invoke(object, args);
        return invoke;
    }

    /**
     * 给所有代理的方法加日志信息
     * @param msg
     */
    private void log(String msg) {
        System.out.println(msg + " has been excuted!");
    }
}
