package com.huang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName Log
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/10 23:14
 * @Version 1.0
 */
public class Log implements MethodBeforeAdvice {
    /**
     *
     * @param method 要执行的目标对象的方法
     * @param args 参数
     * @param target 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
