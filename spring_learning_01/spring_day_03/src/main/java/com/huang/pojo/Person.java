package com.huang.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @ClassName Person
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/8 21:09
 * @Version 1.0
 */
@Data
public class Person {
    @Autowired
    private Cat cat;

    @Autowired
    private Dog dog;

    private String name;

    @Autowired
    private Hands hands;
}
