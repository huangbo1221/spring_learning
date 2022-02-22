package com.huang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/22 22:10
 * @Version 1.0
 */
@RestController
@RequestMapping("/json")
public class UserController {

    @RequestMapping("/j1")
    @ResponseBody // 表示直接返回给前端渲染，不经过视图解析器
    public String test01() {
       return "test";
   }
}
