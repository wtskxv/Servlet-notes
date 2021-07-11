package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
/*
*乱码原因：
*   由于在解析过程中默认使用的编码方法为ISO-8859-1（此编码不支持中文），所以解析时一定会出现乱码。
*
* 请求乱码问题
*               tomcat8以上版本                                 Tomcat7及以下版本(了解)
* Get请求        不会乱码                                        new String(req.getParameter(name).getBytes("ISO-8859-1"),"UTF-8");
*
* POST请求       会乱码，通过设置服务器解析编码的格式                 会乱码，通过设置服务器解析编码的格式
*               req.setCharacterEncoding("UTF-8");             req.setCharacterEncoding("UTF-8");
*
* 乱码情况：
*       Post请求：无论什么版本的服务器，post请求中文都会乱码。(req.setCharacterEncoding("UTF-8");)
*
*
* 注：
*       1.req.setCharacterEncoding("UTF-8") 只针对POST请求乱码有效
*       2. new String(req.getParameter(name).getBytes("ISO-8859-1"),"UTF-8");针对任何请求方式
*           但是如果数据本身不乱吗，还依然使用new String()方法转换，则会乱码
* */

@WebServlet("/s02")
public class Servlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求的编码格式
        req.setCharacterEncoding("UTF-8");

        //获取客户端传递的参数
        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");
        System.out.println("姓名：" + uname);
        System.out.println("密码：" + upwd);

        //解决Tomcat7及以下版本的GET请求乱码
        String name = new String(req.getParameter("uname").getBytes(StandardCharsets.UTF_8));
        System.out.println("name:" + name);
    }
}
