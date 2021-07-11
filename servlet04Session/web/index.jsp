<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>获取域对象</title>
  </head>
  <body>
  <%
    // 获取session域对象
    String uname = (String) request.getSession().getAttribute("uname");
    String upwd = (String) request.getSession().getAttribute("upwd");

    // 获取request对象
    String name = (String) request.getAttribute("name");

    out.print("uname:" + uname + ", upwd:" + upwd + ", name:" + name);

  %>
  </body>
</html>
