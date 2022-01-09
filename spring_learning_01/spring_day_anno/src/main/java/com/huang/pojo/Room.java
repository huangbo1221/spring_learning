package com.huang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName Room
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/9 17:52
 * @Version 1.0
 */
@Component
public class Room {
    @Autowired
    private User user;
}
