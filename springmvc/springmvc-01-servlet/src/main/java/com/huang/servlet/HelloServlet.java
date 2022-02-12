package com.huang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName HelloServlet
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/12 22:57
 * @Version 1.0
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取前端参数
        String method = req.getParameter("method");
        if ("add".equals(method)) {
            req.setAttribute("msg", "执行了add方法");
        } else if ("delete".equals(method)) {
            req.setAttribute("msg", "执行了delete方法");
        }
        // 调用业务层

        // 视图转发或者重定向
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
