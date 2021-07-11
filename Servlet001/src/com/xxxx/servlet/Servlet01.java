package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
* 实现Servlet
* 1.创建普通Java类
* 2.实现Servlet的规范，继承HttpServlet类
* 3.重写Service方法，用来处理请求
* 4.设置注解，指定访问的路径
* */
//@WebServlet(name = "Servlet01",value = "/ser01")
//@WebServlet(name = "Servlet01",value = {"/ser01","/ser001"})
//@WebServlet(name = "Servlet01",urlPatterns = {"/ser01","/ser001"})
@WebServlet("/ser01") //路径中的"/"不要忘记写！！
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //打印内容在控制台
        System.out.println("Hello servlet!");
        //通过流输出数据到浏览器
        resp.getWriter().write("Hello Servlet!");
    }
}
