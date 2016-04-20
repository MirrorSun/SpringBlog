<%--
  Created by IntelliJ IDEA.
  User: ENVY HP
  Date: 2016/4/17
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户登录</title>
  </head>
  <body>
    <form action="/ssm/user/login" method="post" id="myform">
      <input type="text " id="username" name="username"/>
      <input type="password " id="password" name="password"/>
      <input type="submit" value="提交" id="login"/>
    </form>
  </body>
</html>
