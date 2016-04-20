<%--
  Created by IntelliJ IDEA.
  User: ENVY HP
  Date: 2016/4/18
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <h3>新用户注册</h3>
  <form action="RegisterAction" method=post">
    <table>
  <tr>
    <td>用户名</td>
    <td><input type="text " name="username"/></td>
  </tr>
  <tr>
    <td>密码</td>
    <td><input type="password " name="password"/></td>
  </tr>
  <tr>
    <td><input type="submit" name="提交"></td>
    <td><input type="reset" name="清空"></td>
  </tr>
     </table>
  </form>
</body>
</html>
