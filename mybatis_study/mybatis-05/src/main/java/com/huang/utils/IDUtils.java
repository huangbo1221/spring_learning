package com.huang.utils;

import java.util.UUID;

/**
 * @ClassName IDUtils
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/28 21:19
 * @Version 1.0
 */
public class IDUtils {
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
