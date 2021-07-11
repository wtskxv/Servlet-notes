package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/*
* Session域对象
*
*       setAttribute()      设置域对象
*       getAttribute()      获取域对象
*       removeAttribute()   移除域对象
*
*       请求转发
*           一次请求
*           request作用域有效
*           session作用域有效
*       重定向
*           两次请求
*           request作用域无效
 *          session作用域有效
*
* */
@WebServlet("/ser02")
public class Session02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session对象
        HttpSession session = req.getSession();

        /* session域对象 */
        //设置session域对象
        session.setAttribute("uname","admin");
        session.setAttribute("upwd","123456");

        //移除session域对象
        session.removeAttribute("upwd");

        /* request域对象 */
        req.setAttribute("name","zhangsan");

        //请求转发跳转到jsp页面
        //req.getRequestDispatcher("index.jsp").forward(req,resp);
        //重定向跳转到index.jsp页面
        resp.sendRedirect("index.jsp");


    }
}
