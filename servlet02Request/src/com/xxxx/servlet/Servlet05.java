package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
*   request作用域
*       通过该对象可以在一个请求中传递数据，作用范围：在一次请求中有效，即服务器跳转有效。（请求转发跳转时有效）
*       // 设置域对象内容
*       request.setAttribute(String name，Object value);
*       // 获取域对象内容
*       request.getAttribute(String name);
*       //删除域对象内容
*       request.removeAttribute(String name);
* */
@WebServlet("/s05")
public class Servlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet05...");

        //设置域对象内容
        req.setAttribute("name","admin");
        req.setAttribute("age",198);
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        req.setAttribute("list",list);

        //请求转发跳转到Servlet06
        //req.getRequestDispatcher("s06").forward(req,resp);
        //请求转发跳转到jsp 并通过域对象传递数据
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}