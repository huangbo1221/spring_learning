package com.huang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName AfterLog
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/10 23:17
 * @Version 1.0
 */
public class AfterLog implements AfterReturningAdvice {
    /**
     * 这个方法表示有了返回值后（全部执行完）执行
     *
     * @param returnValue 返回值
     * @param method 要执行的目标对象的方法
     * @param args 参数
     * @param target 目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName());
    }
}
