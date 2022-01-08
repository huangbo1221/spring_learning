package com.huang.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @ClassName Monkey
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/8 22:14
 * @Version 1.0
 */
@Data
public class Monkey {

    @Autowired
    @Qualifier(value = "hands2")
    private Hands hands;
}
