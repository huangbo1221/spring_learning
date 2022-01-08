package com.huang.pojo;

import lombok.Data;

/**
 * @ClassName Hands
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/8 21:48
 * @Version 1.0
 */
@Data
public class Hands {
    private String name;

    public void useHands() {
        System.out.println("shake hands!");
    }
}
