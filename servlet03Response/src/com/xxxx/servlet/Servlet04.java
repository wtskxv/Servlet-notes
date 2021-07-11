package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
* 重定向
*   服务端指导，客户端行为
*   存在两次请求
*   地址栏会发生改变
*   req对象不共享
* */

@WebServlet("/s04")
public class Servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet04...");

        //接受参数
        String uname = req.getParameter("uname");
        System.out.println("Servlet04" +  uname);

        //重定向跳转到05
        resp.sendRedirect("s05");
    }
}
