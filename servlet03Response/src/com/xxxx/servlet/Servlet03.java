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
* 字节流响应数据
*   乱码问题：
*       对于 getOutputStream()方式获取到的字节流，响应中文时，由于本身就是传输的字节，所以此时可能出现乱码，也可能正确显示。
*       当服务端给的字节恰好和客户端使用的编码方式一致时则文本正确显示，否则出现乱码。
*   乱码解决：
 *       1.设置服务端的编码格式
 *       resp.setCharacterEncoding("UTF-8");
 *       2.设置客户端的编码格式
 *         resp.setHeader("content-type","text/html;charset=UTF-8");
 *       总结：设置客户端和服务端的编码都支持中文，且保持一致。
 *        同时设置客户端和服务端的编码格式
 *        resp.setContentType("text/html;charset=UTF-8");
* */

@WebServlet("/s03")
public class Servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //同时设置客户端和服务端的编码格式
        resp.setContentType("text/html;charset=UTF-8");
        /*  getOutputStream()   字节输出流 （输出一切数据）*/
        //  得到字节输出流
        ServletOutputStream out = resp.getOutputStream();
        //  输出数据
        out.write("<h2>你好我擦</h2>".getBytes("UTF-8"));

    }
}
