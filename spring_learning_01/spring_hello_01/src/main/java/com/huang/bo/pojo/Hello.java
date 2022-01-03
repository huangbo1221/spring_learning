package com.huang.bo.pojo;

/**
 * @ClassName Hello
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/1/3 19:54
 * @Version 1.0
 */
public class Hello {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
