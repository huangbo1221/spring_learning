package com.huang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @ClassName AnnotationPointCut
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/11 22:02
 * @Version 1.0
 */
@Aspect // 定义切面
public class AnnotationPointCut {
    // 定义切入点
    @Before("execution(* com.huang.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前！");
    }

    @After("execution(* com.huang.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后！");
    }

    @Around("execution(* com.huang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前！");
        pjp.proceed();
        System.out.println("环绕后！");
    }
}
