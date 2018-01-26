<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пользователи</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>userLogin</th>
        <th>userPassword</th>
        <th>name</th>
        <th>email</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.userLogin}</td>
            <td>${user.userPassword}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
        </tr>
    </c:forEach>
</table>

<form action="/users" method="post">
    <input type="text" placeholder="ЛОГИН" name="userLogin">
    <input type="password" placeholder="ПАРОЛЬ" name="userPassword">
    <input type="text" placeholder="ИМЯ" name="name">
    <input type="text" placeholder="ПОЧТА" name="email">
    <input type="submit" value="Send">

</form>

</body>
</html>
