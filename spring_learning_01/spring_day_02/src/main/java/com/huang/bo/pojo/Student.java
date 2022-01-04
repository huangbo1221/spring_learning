package com.huang.bo.pojo;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName Student
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/4 22:30
 * @Version 1.0
 */
@Data
public class Student {
    private String name;

    private Address address;

    private String[] books;

    private List<String> hobbies;

    private Map<String, String> card;

    private Set<String> games;

    private String wife;

    private Properties prop;
}
