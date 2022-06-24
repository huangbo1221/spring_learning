<%--
  Created by IntelliJ IDEA.
  User: 15603
  Date: 2022/6/23
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%--  提交隐藏域，前端无法看见该项     --%>
        <input type="hidden" name="bookId" value="${qbook.bookId}">
        <div class="form-group">
            <label>书籍名称：</label>
            <input type="text" name="bookName" class="form-controll" value="${qbook.bookName}" required>
        </div>
        <div class="form-group">
            <label>书籍数量：</label>
            <input type="text" name="bookCounts" class="form-controll" value="${qbook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>书籍描述：</label>
            <input type="text" name="detail" class="form-controll" value="${qbook.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-controll" id="修改">
        </div>
    </form>

</div>

</body>
</html>
