package com.huang.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/15 21:01
 * @Version 1.0
 */
@Data
@NoArgsConstructor
public class UserInfo {
    private int id;

    private String name;

    private String code;
}
