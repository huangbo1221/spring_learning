package com.huang.bo.pojo;

import lombok.Data;

/**
 * @ClassName User
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/6 7:42
 * @Version 1.0
 */
@Data
public class User {

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private  int age;
}
