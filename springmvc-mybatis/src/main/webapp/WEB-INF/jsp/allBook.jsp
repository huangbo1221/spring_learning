<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 15603
  Date: 2022/2/27
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示页面</title>
    <%--  Bootstrap  --%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>书籍列表 ---------- 显示所有书籍</small>
                    </h1>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4 column">
                    <%--        toAddBook        --%>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook" >新增书籍</a>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/list" >显示全部书籍</a>
                </div>

                <div class="col-md-4 column">
                    <%--        查询书籍        --%>
                    <form action="${pageContext.request.contextPath}/book/queryBookByName" method="post" style="float: right" class="form-inline">
                        <input type="text" name="queryBookName" class="form-control" placeholder="请输入要查询的书籍名称">
                        <input type="submit" name="查询" class="btn btn-primary">
                    </form>
                </div>
            </div>
        </div>

        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                        <tr>
                            <th>书籍编号</th>
                            <th>书籍名称</th>
                            <th>书籍数量</th>
                            <th>书籍详情</th>
                            <th>操作</th>
                        </tr>
                    </thead>

                    <%-- 书籍从数据库中查询出来，从list中遍历  --%>
                    <tbody>
                        <c:forEach var="book" items="${list}">
                            <tr>
                                <td>${book.bookId}</td>
                                <td>${book.bookName}</td>
                                <td>${book.bookCounts}</td>
                                <td>${book.detail}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/book/toUpdateBook?bookId=${book.bookId}">修改</a>
                                    &nbsp; | &nbsp;
                                    <a href="${pageContext.request.contextPath}/book/deleteBook/${book.bookId}">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</body>
</html>
