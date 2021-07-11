package com.xxxx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/*
* Session对象的销毁
*       1，默认到期时间
*       Tomcat中的session默认存活时间为30min，即你不操作界面的内容，30min销毁，一旦有操作，session会重新计时。
*       可以在Tomcat中的conf目录下的web.xml文件中进行修改。
*
* */
@WebServlet("/ser03")
public class Session03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session对象
        HttpSession session = req.getSession();
        /* session域对象 */
        //设置session域对象
        session.setAttribute("uname","admin");

        //Session对象的最大不活动时间
        //System.out.println("Session对象的最大不活动时间：" + session.getMaxInactiveInterval());
        //修改最大不活动时间
        //session.setMaxInactiveInterval(15);// 15秒

        //立即销毁 可以通过 session.invalidate() 方法让 session 立刻失效
        //session.invalidate();


    }
}
