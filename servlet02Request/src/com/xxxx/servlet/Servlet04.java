package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
* 请求转发
*   可以让请求从服务端跳转到客户端（或跳转到指定Servlet）
*   服务端行为
* */
@WebServlet("/s04")
public class Servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受客户端请求的参数
        String uname = req.getParameter("uname");
        System.out.println("Servlet04 uname" + uname);
    }
}
