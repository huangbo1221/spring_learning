package com.huang.controller;

import com.huang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.Socket;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/21 21:03
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/t1")
    public String test01(@RequestParam("userName") String name, Model model) {
        System.out.println("前端传的参数为： " + name);

        model.addAttribute("msg", name);

        return "test";
    }

    /**
     * 1、接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
     * 2、假设传递的是一个User对象，匹配User对象中的字段名，如果名字一致则匹配成功，否则匹配不上。
     *
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("t2")
    public String test02(User user, Model model) {
        System.out.println(user);
        model.addAttribute("msg", "success!");
        return "test";
    }

    @RequestMapping("/t3")
    public String test04(String name, Model model) {
        System.out.println(name);
        model.addAttribute("msg", name);
        return "test";
    }
}
