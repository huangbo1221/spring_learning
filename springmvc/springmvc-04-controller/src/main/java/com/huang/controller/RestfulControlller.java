package com.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName RestfulControlller
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/15 22:57
 * @Version 1.0
 */
@Controller
public class RestfulControlller {

    // 非restful风格的访问方式
    @RequestMapping("/r1")
    public String test1(int a, int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "test1 method! res:" + res);
        return "test";
    }

    // restful风格的访问方式
    @RequestMapping("/r2/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "test2 method! res:" + res);
        return "test";
    }

    // restful风格的访问方式
    @RequestMapping(value = "/r3/{a}/{b}", method = RequestMethod.GET)
    public String test3(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "test3 method! res:" + res);
        return "test";
    }

    // restful风格的访问方式
    @GetMapping(value = "/r4/{a}/{b}")
    public String test4(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "test4 method! res:" + res);
        return "test";
    }

}
