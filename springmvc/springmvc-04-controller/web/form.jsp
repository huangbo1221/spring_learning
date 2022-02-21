<%--
  Created by IntelliJ IDEA.
  User: 15603
  Date: 2022/2/21
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/t3" method="post">
    <input type="text" name="name">
    <input type="submit">
</form>
</body>
</html>
