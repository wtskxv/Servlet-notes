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
@WebServlet("/s06")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet06...");
        // 获取域对象内容
        String name = (String) req.getAttribute("name");
        System.out.println("name: " + name);
        Integer age = (Integer) req.getAttribute("age");
        System.out.println("age: " + age);
        List<String> list = (List<String>) req.getAttribute("list");
        System.out.println(list.get(0));
    }
}
