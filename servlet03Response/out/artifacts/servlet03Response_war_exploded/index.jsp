<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <!-- Java脚本段 -->
      <%
          // 获取参数
        String uname = request.getParameter("uname");
        // 获取req作用域
        String upwd = (String) request.getAttribute("upwd");

        //输出内容
        out.print(uname);
        out.print("-------------");
        out.print(upwd);
      %>
  </body>
</html>
