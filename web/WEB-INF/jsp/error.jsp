<%--
  Created by IntelliJ IDEA.
  User: 14170
  Date: 8/12/2020
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bug...</title>

    <script type="text/javascript" src="../../js/jquery-1.8.3.min.js"></script>

    <script>
        $(function() {
            $("#msg").click(function () {
                if (confirm("联系admin邮箱: 3231576185@qq.com") == true) {
                    alert("谢谢反馈");
                    return true;
                } else {
                    return false;
                }
            })
        })
    </script>
</head>
<body>
    <span style="color:red; font-size:48px;"><b>傻逼, 你是专业写bug的吧？？？</b></span>
    <br /><hr /><br />
    <a id="msg" href="#">${msg}</a> <br/><br>
    <b>&nbsp;&nbsp;${msg2}</b>
</body>
</html>
