package com.huang.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Blog
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/28 21:08
 * @Version 1.0
 */
@Data
public class Blog {
    private String id;

    private String title;

    private String author;

    private Date createTime;

    private int views;

}
