<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
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
        <th>kcal</th>
        <th>weight</th>
    </tr>
    <#list (order.goods)! as goods>
        <tr>
            <td>${goods.id}</td>
            <td>${goods.name}</td>
            <td>${goods.price}</td>
            <td>${(goods.kcal)!}</td>
            <td>${goods.weight}</td>
            <td><a href="/basket/delete?id=${goods_index}">Убрать с корзины</a></td>


        </tr>

        <#--<#list-->
        <#--goods.orders as order>-->
            <#--<tr><td>${order.time}</td></tr>-->
        <#--</#list>-->
    </#list>

</table>
<td><a href="/goods">Перейти в список товаров</a></td>


<#--<form action="/users" method="post">-->
    <#--<input type="text" placeholder="ЛОГИН" name="userLogin">-->
    <#--<input type="password" placeholder="ПАРОЛЬ" name="userPassword">-->
    <#--<input type="text" placeholder="ИМЯ" name="name">-->
    <#--<input type="text" placeholder="ПОЧТА" name="email">-->
    <#--<input type="submit" value="Send">-->

<#--</form>-->

</body>
</html>
