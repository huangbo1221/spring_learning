package com.huang.pojo;

import lombok.Data;

import javax.annotation.Resource;

/**
 * @ClassName Bear
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/8 22:31
 * @Version 1.0
 */
@Data
public class Bear {
    @Resource(name = "hands2")
    private Hands hands;
}
