package com.huang.demo1;

/**
 * @ClassName Client
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/9 22:19
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        landlord.rent();
        System.out.println("=====================");
        Proxy proxy = new Proxy(landlord);
        proxy.rent();
    }
}
