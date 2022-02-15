package com.huang.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName Test1Controller
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/15 22:13
 * @Version 1.0
 */
public class Test1Controller implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mw = new ModelAndView();
        mw.addObject("msg", "Test1Controller");

        mw.setViewName("test");
        return mw;
    }
}
