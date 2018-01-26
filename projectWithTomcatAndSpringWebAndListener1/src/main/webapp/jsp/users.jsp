<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пользователи</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
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

<form action="/users_as_jsp" method="post">
    <input type="text" placeholder="userLogin" name="name">
    <input type="password" placeholder="userPassword" name="name">
    <input type="text" placeholder="name" name="name">
    <input type="text" placeholder="email" name="citizen">
    <input type="submit" value="Send">

</form>

</body>
</html>
