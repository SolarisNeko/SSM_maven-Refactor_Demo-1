<%--
  Created by IntelliJ IDEA.
  User: 14170
  Date: 8/12/2020
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/check_login">
        用户名:<input  type="text" name="username"><br/>
        密码:<input  type="text" name="password"><br/>
        <input type="submit" value="登录"><br/>
    </form>

</body>
</html>
