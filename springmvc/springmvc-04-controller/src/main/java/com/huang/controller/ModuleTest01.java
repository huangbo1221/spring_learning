package com.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName ModuleTest01
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/17 22:29
 * @Version 1.0
 */
@Controller
public class ModuleTest01 {
    @RequestMapping("m1/t1")
    public void test01(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("msg", "ModuleTest01的ModuleTest01");
        // 手动重定向，无需通过返回值的重定向（视图解析器）
        request.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(request, response);
    }

    @RequestMapping("m1/t2")
    public String test02(Model model){
        model.addAttribute("msg", "ModuleTest01的test02");
        // 视图解析器若存在，则会先走视图解析器拼接，然后转发到指定路径
        return "/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("m1/t3")
    public String test03(Model model){
        model.addAttribute("msg", "ModuleTest01的test03");
        // 直接转发到指定路径
        return "forward:/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("m1/t4")
    public String test04(Model model){
        model.addAttribute("msg", "ModuleTest01的test04");
        // 重定向转发到指定路径
        return "redirect:/index.jsp";
    }
}
