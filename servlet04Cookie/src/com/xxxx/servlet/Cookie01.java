package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* Cookie的创建和发送
* */

@WebServlet("/cook01")
public class Cookie01 extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Cookie的创建
        Cookie cookie = new Cookie("name","admin");
        //发送（响应）Cookie对象
        resp.addCookie(cookie);
    }
}
