<#--<br>-->
<#--<table>-->
<#--<tr>-->
<#--<th>Photo</th>-->
<#--<th>name</th>-->
<#--<th>price</th>-->
<#--<th>kcal</th>-->
<#--<th>weight</th>-->
<#--</tr>-->
<#--<#list (order.goods)! as goods>-->
<#--<tr>-->
<#--<td>-->
<#--<div id="avatar">-->
<#--<#if (goods.image.storageFileName)??>-->

<#--<p><a href="/goods/oneGoods?id=${goods.id}">-->
<#--<img class="img-circle" width='100' height='100' src="/files/${goods.image.storageFileName}"></a></p>-->
<#--</#if>-->

<#--</div>-->
<#--</td>-->
<#--<td>${goods.name}</td>-->
<#--<td>${goods.price}</td>-->
<#--<td>${(goods.kcal)!}</td>-->
<#--<td>${goods.weight}</td>-->
<#--<td><a href="/basket/delete?id=${goods_index}">Убрать с корзины</a></td>-->

<#--</tr>-->


<#--</#list>-->

<#--</table>-->

<#--<br>-->
<#--<h4> Номер заказа - ${order.id}</h4>-->
<#--<br>-->
<#--<td><a href="/goods">Перейти в список товаров</a></td>-->
<#--<td><a href="/profile">Вернуться в профиль</a></td>-->


<#--<br>-->
<#--<div>-->
<#--<h4><a href="/basket/checkout">Оформить заказ</a></h4>-->
<#--</div>-->



<#--<#ftl encoding='UTF-8'>-->
<#import 'spring.ftl' as spring>





<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Bootstrap CSS -->
    <!--<link rel="stylesheet" href="css/bootstrap.min.css"/>-->
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/main.css"/>
    <script src="/js/main.js"></script>

    <title>Hello, world!</title>
</head>
<body>
<nav class=" container navbar navbar-expand-sm navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto">

            <li class=" nav-item active">
                <a class="nav-link" href="/profile">Профиль <span class="sr-only">(current)</span></a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="/profile/goods">Товары</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">
                    Заказы
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">

                    <a class="dropdown-item" href="/profile/orders">Все заказы</a>
                    <a class="dropdown-item" href="#">Последний заказ</a>

                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="/logout">Выход</a>
            </li>
        </ul>

    </div>
</nav>


<div class="container ">
    <div class="row">
        <div class="col-1"></div>
        <div class="col-10 pt-3 ">
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">Фото</th>
                    <th scope="col">Имя товара</th>
                    <th scope="col">Вес</th>
                    <th scope="col">Энергия </th>
                    <th scope="col">Цена</th>
                    <th scope="col"></th>
                </tr>
                </thead>
                <tbody>
                <#list (order.goods)! as goods>

                    <tr>
                    <td><#if (goods.image.storageFileName)??>

                        <p><a href="/goods/oneGoods?id=${goods.id}">
                            <img class="img-circle" width='100' height='100' src="/files/${goods.image.storageFileName}"></a></p>
                    </#if></td>
                    <td class="align-middle">${(goods.name)!}</td>
                    <td class="align-middle">${(goods.weight)!}</td>
                    <td class="align-middle">${(goods.kcal)!} кКал</td>
                    <td class="align-middle">${(goods.price)!} руб.</td>
                    <td class="align-middle">
                        <button class="btn btn-light" onclick="deleteGoodsFromBasket(${goods.id},this)">Удалить с
                            корзины
                        </button>
                    </td>
                    </td>
                </tr>
                </#list>
                </tbody>

            </table>


        </div>


    </div>


</div>
</div>


<nav class=" navbar fixed-bottom container navbar navbar-dark navbar-expand-sm bg-dark justify-content-between ">
    <a class="navbar-brand " href="/basket">Корзина</a>
    <div class="collapse navbar-collapse" id="navbarSupportedContent1">
    </div>

    <form class="form-inline">
        <div class="text-info text-light pr-3 h6">Сумма заказа</div>
        <div class="form-control mr-sm-2">${sum}</div>
        <a class="btn btn-outline-success my-2 my-sm-0" role="button" href="/basket/checkout" type="submit">Оформить
            заказ</a>
    </form>
</nav>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="/js/main.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>









