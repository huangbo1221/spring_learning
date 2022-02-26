package com.huang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

   @RequestMapping("/j2")
   @ResponseBody
   public String test02 () {
       User user = new User("测试", 1, 2);
       return user.toString();
   }

    @RequestMapping(value = "/j3", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test03 () {
        User user = new User("测试", 1, 2);
        return user.toString();
    }

    @RequestMapping(value = "/j4", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test04() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user1 = new User("测试1", 1, 2);
        User user2 = new User("测试2", 1, 2);
        User user3 = new User("测试3", 1, 2);
        User user4 = new User("测试4", 1, 2);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        String valueAsString = objectMapper.writeValueAsString(users);
        return valueAsString;
    }

    @RequestMapping("/j5")
    public String test05() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return simpleDateFormat.format(date);
    }
}
