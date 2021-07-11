package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
* 请求转发
*   req.getRequestDispatcher(url).forward(req,resp);
*   可以让请求从服务端跳转到客户端（或跳转到指定Servlet）
*   服务端行为
*   特点：
*       1.服务端行为
*       2.地址栏不发生改变
*       3.从始至终只有一个请求
*       4.req数据可以共享
* */
@WebServlet("/s03")
public class Servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受客户端请求的参数
        String uname = req.getParameter("uname");
        System.out.println("Servlet03 uname" + uname);

        //请求转发跳转到Servlet04
        //req.getRequestDispatcher("s04").forward(req,resp);
        // 请求转发跳转到jsp页面
        //req.getRequestDispatcher("login.jsp").forward(req,resp);
        // 请求转发跳转到html页面
         req.getRequestDispatcher("login.html").forward(req,resp);
    }
}
