package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/*
* 响应数据
*       getWriter()         字符输出流（输出字符串）
*       getOutputStream()   字节输出流（输出一切数据）
*
*       两种流不可同时使用，如果同时使用会报错
* */

@WebServlet("/s01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*  getWriter() 字符输出流   （输出字符串）*/
        //获取字符输出流
        PrintWriter writer = resp.getWriter();
        //输出数据
        writer.write("Hello");


        /*  getOutputStream()   字节输出流 （输出一切数据）*/
        //  得到字节输出流
        ServletOutputStream out = resp.getOutputStream();
        //  输出数据
        out.write("Hi".getBytes());

    }
}
