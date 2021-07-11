package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
* 重定向与请求转发的区别
*     1.请求转发的地址栏不会发生改变，重定向的地址栏会发生改变
*     2.请求转发只有一次请求，重定向有两次请求
*     3.请求转发时req对象可共享，重定向时req对象不共享
*     4.请求转发是服务端行为，重定向是客户端行为
*     5.请求转发时的地址只能是当前站点下（当前项目）的资源，重定向时地址可以是任何地址
* */

@WebServlet("/s06")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet06...");

        //接受参数
        String uname = request.getParameter("uname");
        System.out.println(uname);

        //设置req域对象
        request.setAttribute("upwd",123456);

        //请求转发
        //request.getRequestDispatcher("index.jsp").forward(request,response);

        //重定向
        //response.sendRedirect("index.jsp");

        //测试：重定向跳转到百度
        //response.sendRedirect("http://www.baidu.com");

        //请求转发到百度(404)
        //request.getRequestDispatcher("http://www.baidu.com").forward(request,response);

    }
}
