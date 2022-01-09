package com.huang.demo1;

/**
 * @ClassName Proxy
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/9 22:20
 * @Version 1.0
 */
public class Proxy implements Rent{
    private Landlord landlord;

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rent() {
        lookForHouse();
        System.out.print("通过代理----->");
        landlord.rent();
        sign();
        giveMoney();
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
