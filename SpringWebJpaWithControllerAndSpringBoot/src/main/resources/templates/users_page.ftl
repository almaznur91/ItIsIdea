<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>News- Регистрация</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>userLogin</th>
        <th>userPassword</th>
        <th>name</th>
        <th>email</th>
        <#--<th>orders</th>-->

    </tr>
    <#list model.users as user>
    <tr>
        <td>${user.id}</td>
        <td>${user.userLogin}</td>
        <td>${user.userPassword}</td>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <#--<td>${user.orders}</td>-->
        <#--<td>${user.registrationTime}</td>-->
    </tr>
    </#list>
</table>
</body>
</html>