<%--
  Created by IntelliJ IDEA.
  User: xiaohaha
  Date: 2021/8/24
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加图书</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 colum">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name ="bookID" value="${book.bookID}">
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <%--input标签内的name必须和pojo的属性一样--%>
            <input type="text" class="form-control" id="bookName" name="bookName" required value="${book.bookName}">

        </div>
        <div class="form-group">
            <label for="bookNum">书籍数量</label>
            <input type="text" class="form-control" id="bookNum" name="bookCounts" required value="${book.bookCounts}">
        </div>
        <div class="form-group">
            <label for="bookDetail">书籍简介</label>
            <input type="text" class="form-control" id="bookDetail" name="detail" required value="${book.detail}">
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>

</div>
</body>
</html>

