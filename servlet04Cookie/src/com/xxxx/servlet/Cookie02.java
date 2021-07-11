package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
* Cookie的获取
* 返回的是coolie数组
* */

@WebServlet("/cook02")
public class Cookie02 extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取cookie数组
        Cookie[] cookies = req.getCookies();
        //判断cookie是否为空
        if (cookies != null && cookies.length > 0) {
            //遍历cookie数组
            for (Cookie cookie:cookies) {
                //获取cookie的名称和值
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println("名称:" + name + ", 值：" + value);
            }
        }
    }
}
