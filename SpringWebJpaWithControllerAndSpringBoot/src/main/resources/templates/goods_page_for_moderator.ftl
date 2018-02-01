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
        <th>kcal</th>
        <th>weight</th>

    </tr>
    <#list model.goods as goods>
        <tr>
            <td>${goods.id}</td>
            <td>${goods.name}</td>
            <td>${goods.price}</td>
            <td>${(goods.kcal)!}</td>
            <td>${(goods.status)!}</td>


            <td><a href="/goods/delete?id=${goods.id}">Снять с публикации</a></td>
            <td><a href="/goods/add_to_basket?id=${goods.id}">Добавить в корзину</a></td>
            <td><a href="/goods/publish?id=${goods.id}">Опубликовать товар</a></td>

        </tr>

        <#--<#list-->
        <#--goods.orders as order>-->
            <#--<tr><td>${order.time}</td></tr>-->
        <#--</#list>-->
    </#list>

</table>
<td><a href="/addGoods">Добавить новый товар!</a></td>
<td><a href="/basket">Перейти в корзину</a></td>
<td><a href="/profile">Вернуться в профиль</a></td>



<#--<form action="/users" method="post">-->
    <#--<input type="text" placeholder="ЛОГИН" name="userLogin">-->
    <#--<input type="password" placeholder="ПАРОЛЬ" name="userPassword">-->
    <#--<input type="text" placeholder="ИМЯ" name="name">-->
    <#--<input type="text" placeholder="ПОЧТА" name="email">-->
    <#--<input type="submit" value="Send">-->

<#--</form>-->

</body>
</html>
