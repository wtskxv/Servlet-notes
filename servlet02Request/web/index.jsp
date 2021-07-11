<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>index页面</h2>
  <%
    //获取域对象
    //获取域对象内容
    String name = (String) request.getAttribute("name");
    System.out.println("name: " + name);
    Integer age = (Integer) request.getAttribute("age");
    System.out.println("age: " + age);
    List<String> list = (List<String>) request.getAttribute("list");
    System.out.println(list.get(0));
  %>
  </body>
</html>
