package com.huang.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/9 21:24
 * @Version 1.0
 */
@Data
@Component
public class User {
    @Value("liubo1221")
    private String name;
}
