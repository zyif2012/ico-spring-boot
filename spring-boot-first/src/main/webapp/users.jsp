<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
<h2>Submitted User</h2>
<table>
    <tr>
        <td>Username</td>
        <td>${username}</td>
    </tr>
    <tr>
        <td>password</td>
        <td>${password}</td>
    </tr>
    <tr>
        <td>Favor</td>
        <td>
            <c:forEach items="${favor}" var="item">
                ${item}
            </c:forEach>
        </td>
    </tr>
    <tr>
        <td>Country</td>
        <td>${country}</td>
    </tr>
    <tr>
        <td>Skills</td>
        <td>
            <c:forEach items="${skills}" var="item">
                ${item}
            </c:forEach>
        </td>
    </tr>
</table>
</body>
</html>
