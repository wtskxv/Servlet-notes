package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/*
* 字符流相应数据
* 乱码原因：
*   对于  getWriter()获取到的字符流，响应中文必定出乱码，由于服务器端在进行编码时默认会使用ISO-8859-1 格式的
*   编码，该编码方式并不支持中文！
* 乱码解决：
*       1.设置服务端的编码格式
*       resp.setCharacterEncoding("UTF-8");
*       2.设置客户端的编码格式
*         resp.setHeader("content-type","text/html;charset=UTF-8");
*       总结：设置客户端和服务端的编码都支持中文，且保持一致。
*        同时设置客户端和服务端的编码格式
*        resp.setContentType("text/html;charset=UTF-8");
*
*
*
* */

@WebServlet("/s02")
public class Servlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*//设置服务端的编码格式
        resp.setCharacterEncoding("UTF-8");
        //设置客户端的编码格式和响应的MIME类型
        resp.setHeader("content-type","text/html;charset=UTF-8");*/

        //同时设置客户端和服务端的编码格式
        resp.setContentType("text/html;charset=UTF-8");

        /*  getWriter() 字符输出流   （输出字符串）*/
        //获取字符输出流
        PrintWriter writer = resp.getWriter();
        //输出数据
        writer.write("<h2>你好</h2>");
    }
}
