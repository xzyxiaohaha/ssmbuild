<%--
  Created by IntelliJ IDEA.
  User: xiaohaha
  Date: 2021/8/24
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示页面</title>
    <style>
        h3{
            width: 380px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background-color: deepskyblue;
            border-radius: 5px;
        }
        a{
            text-decoration: none;
            color: black;
            font-size: 18px;
        }
    </style>
</head>
<body>
    <h3>
        <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
    </h3>
</body>
</html>
