package com.huang.diy;

/**
 * @ClassName DiyPointCut
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/11 21:44
 * @Version 1.0
 */
public class DiyPointCut {
    public void before() {
        System.out.println("方法执行前！");
    }

    public void after() {
        System.out.println("方法执行后！");
    }
}
