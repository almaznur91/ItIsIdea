<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>

<html>
<head>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/main.css"/>
        <title>Товары</title>
    </head>

</head>


<body>
<nav class=" container navbar navbar-expand-sm navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto">

            <li class=" nav-item active">
                <a class="nav-link" href="/profile">Профиль <span class="sr-only">(current)</span></a>
            </li>

            <#if model.operator??>
            <#else >
            <li class="nav-item">
                <a class="nav-link" href="/profile/goods">Товары</a>
            </li>
            </#if>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Заказы
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">

                    <#if model.operator??>
                    <#else >
                    <a class="dropdown-item" href="/orders">Все заказы</a>
                    <a class="dropdown-item" href="#">Последний заказ</a>
                    </#if>

                    <#if model.operator??>
                    <a class="dropdown-item" href="/operator">Заказы</a>
                    </#if>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="/logout">Выход</a>
            </li>
        </ul>

    </div>
</nav>



<#if model.operator??>

<div class="container">
    <div class="row pt-2">
        <div class="col-4"></div>
        <div class="col-4">
            <div class="text-info mx-auto h5 text-dark">Страница заказа №${model.order.id}</div>
        </div>
        <div class="col-4"></div>
    </div>

</div>
</#if>

<div class="container pb-5">

    <#if model.operator??>
    <div class="row pt-3">
        <div class="col-3"></div>
        <div class="col-6">

            <div class="row border border-dark p-3 ">
                <div class="col-5">
                   <img width="250" src="${(model.user.imageUrl)!}"
                         class=" row rounded mx-auto d-block" alt="...">

                </div>
                <div class="col-7">
                    <div class="d-table">
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Имя:</div>
                            <div class="d-table-cell ">${(model.user.name)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Email:</div>
                            <div class="d-table-cell ">${(model.user.email)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Адрес:</div>
                            <div class="d-table-cell ">${(model.user.address)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Номер телефона:</div>
                            <div class="d-table-cell ">${(model.user.telephone)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell h6 pt-3 pb-2 pr-2 pl-2">Сумма заказа</div>
                            <div class="d-table-cell h6">${(model.sumbyorder)!} руб.</div>
                        </div>

                    </div>
                </div>

            </div>
        </div>
    </div>


    </#if>

    <div class="row pt-3">
        <#list model.goods as goods>
        <div class="col-4 p-3">
            <a href="/oneGoods?id=${goods.id}"><img src="/files/${(goods.image.storageFileName)!}" class="w-75 h-25 row rounded mx-auto d-block" alt="..."></a>
            <p class="h6 text-center pt-2">${(goods.name)!"Пусто"}</p>
            <div class="d-table m-auto">
                <div class="d-table-row">
                    <div class="d-table-cell pt-1 pr-2">Вес:</div>
                    <div class="d-table-cell ">${(goods.weight)!} гр.</div>
                </div>
                <div class="d-table-row">
                    <div class="d-table-cell pt-1 pr-2">Колории:</div>
                    <div class="d-table-cell ">${(goods.kcal)!} kkal</div>
                </div>
            </div>
            <div class="row justify-content-center pt-2">
                <div class="h4 mx-auto pl-3 col-4 text-right">${(goods.price)!} Р</div>
            <#if model.operator?? >
            <#else >
            <button onclick="addToBasket(${goods.id})" class="col-6 btn btn-success">В корзину</button>

            </#if>
            </div>
        </div>
        </#list>
    </div>
</div>



<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="/js/main.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



<#if model.user ??>
<#else >
    <nav class=" navbar fixed-bottom container navbar navbar-dark navbar-expand-sm bg-dark justify-content-between ">
        <a class="navbar-brand " href="/basket" >Корзина</a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent1">
        </div>

        <form class="form-inline">
            <div class="text-info text-light pr-3 h6">Сумма заказа</div>
            <div class="form-control mr-sm-2">${(model.sum)!}</div>
            <a class="btn btn-outline-success my-2 my-sm-0" role="button" href="/checkout" type="submit">Оформить заказ</a>
        </form>
    </nav>
</#if>










<#--<body>-->
<#--<table>-->
<#--<tr>-->
<#--<th>ID</th>-->
<#--<th>name</th>-->
<#--<th>price</th>-->
<#--<th>kcal</th>-->
<#--<th>weight</th>-->

<#--</tr>-->
<#--<#list model.goods as goods>-->
<#--<tr>-->
<#--<td>-->
<#--<div id="avatar">-->
<#--<#if (goods.image.storageFileName)??>-->

<#--<p><a href="/goods/oneGoods?id=${goods.id}">-->
<#--<img class="img-circle" width='100' height='100' src="/files/${goods.image.storageFileName}"></a></p>-->
<#--</#if>-->

<#--</div>-->
<#--</td>-->
<#--<td>${goods.id}</td>-->
<#--<td>${(goods.name)!"Пусто"}</td>-->
<#--<td>${goods.price}</td>-->
<#--<td>${(goods.kcal)!}</td>-->

<#--<#if model.operator?? >-->
<#--<#else >-->
<#--<td><a href="/goods/add_to_basket?id=${goods.id}">Добавить в корзину</a></td>-->
<#--</#if>-->




<#--</tr>-->

<#--&lt;#&ndash;<#list&ndash;&gt;-->
<#--&lt;#&ndash;goods.orders as order>&ndash;&gt;-->
<#--&lt;#&ndash;<tr><td>${order.time}</td></tr>&ndash;&gt;-->
<#--&lt;#&ndash;</#list>&ndash;&gt;-->
<#--</#list>-->


<#--</table>-->
<#--
    <#if model.operator?? >

            <h4>Информация о покупателе:</h4>
           <h5>Имя - ${(model.user.name)!"нет информации о имени"}</h5>
           <h5>Email - ${(model.user.email)!"нет информации о почте"}</h5>
           <h5>Адрес - ${(model.user.address)!"нет информации о адресе"}</h5>
           <h5>Телефонный номер - ${(model.user.telephone)!"нет информации о телефоне"}</h5>

    </#if>


    <#if model.operator?? >
    <#else >
          <td><a href="/basket">Перейти в корзину</a></td>
    </#if>

    <#if model.operator?? >
    <#else >
<td><a href="/profile">Вернуться в профиль</a></td>
    </#if>

    <#if model.operator??>
<td><a href="/operator">Вернуться в список заказов</a></td>

    </#if>





-->

</body>
</html>
