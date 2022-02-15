package com.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloAnnoController
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/15 21:33
 * @Version 1.0
 */
@Controller
@RequestMapping("/hellocontroller")
public class HelloAnnoController {

//    真实访问地址：/hellocontroller/hello
    @RequestMapping("/hello")
    public String sayHello(Model model) {
        // 向模型中添加属性msg的值，可以在jsp中取出并渲染
        model.addAttribute("msg", "hello, springmvc annotion!");
        // WEB-INF/jsp/hello.jsp
        return "hello";
    }
}
