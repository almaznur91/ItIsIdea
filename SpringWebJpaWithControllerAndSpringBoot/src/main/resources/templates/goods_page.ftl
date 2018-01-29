<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Товары</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>name</th>
        <th>price</th>
        <th>ccal</th>
        <th>weight</th>
    </tr>
    <#list model.goods as goods>
        <tr>
            <td>${goods.id}</td>
            <td>${goods.name}</td>
            <td>${goods.price}</td>
            <td>${goods.ccal}</td>
            <td>${goods.weight}</td>
            <td><a href="/goods/delete?id=${goods.id}">Удалить</a></td>
        </tr>
    </#list>
</table>

<#--<form action="/users" method="post">-->
    <#--<input type="text" placeholder="ЛОГИН" name="userLogin">-->
    <#--<input type="password" placeholder="ПАРОЛЬ" name="userPassword">-->
    <#--<input type="text" placeholder="ИМЯ" name="name">-->
    <#--<input type="text" placeholder="ПОЧТА" name="email">-->
    <#--<input type="submit" value="Send">-->

<#--</form>-->

</body>
</html>
