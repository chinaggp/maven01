<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/15
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <table>
        <tr>
            <td>姓名</td>
            <td>${item.name}</td>
        </tr>
        <tr>
            <td>价格</td>
            <td>${item.name}</td>
        </tr>
        <tr>
            <td>创建时间</td>
            <td><fmt:formatDate value="${item.createtime}" pattern="yyyy:MM:dd HH:mm:ss" /></td>
        </tr>
        <tr>
            <td>描述</td>
            <td>${item.name}</td>
        </tr>
    </table>
</form>

</body>
</html>
