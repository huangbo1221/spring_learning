package com.huang.pojo;

import lombok.Data;

/**
 * @ClassName Person
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/8 21:09
 * @Version 1.0
 */
@Data
public class Person {
    private Cat cat;

    private Dog dog;

    private String name;
}
