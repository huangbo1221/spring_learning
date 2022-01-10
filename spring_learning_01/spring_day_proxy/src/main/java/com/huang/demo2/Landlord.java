package com.huang.demo2;

/**
 * @ClassName Landlord
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/9 22:19
 * @Version 1.0
 */
public class Landlord implements Rent {
    @Override
    public void rent() {
        System.out.println("房东出租房子！");
    }
}
