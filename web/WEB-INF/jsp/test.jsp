<%--
  Created by IntelliJ IDEA.
  User: 14170
  Date: 8/12/2020
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Ajax~</title>

    <script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>

    <script>
        $(function() {
            $("#btn").click( function() {
                // 发送 ajax 异步请求
                $.ajax({
                    url:"${pageContext.request.contextPath}/list",
                    data:{"name":"wc", "price":100.00},
                    contentType:"application/json; charset=utf-8",
                    success: function(data) {
                        alert(data);
                        alert(data.name);
                        alert(data.price);
                        //...
                    }
                })
            })
        })

    </script>

</head>
<body>
    <input id="btn" type="button" value="发送ajax请求">

</body>
</html>
