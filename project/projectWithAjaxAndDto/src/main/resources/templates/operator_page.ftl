<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>



<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="/js/main.js"></script>

    <link rel="stylesheet" href="css/main.css"/>
    <title>Hello, world!</title>
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
            <#if  model.operator??>
            <#else>
            <li class="nav-item">
                <a class="nav-link" href="/goods">Товары</a>
            </li>
            </#if>
            <li class="nav-item dropdown">
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">

                    <#if  model.operator??>

                        <a class="dropdown-item" href="/operator">Заказы</a>

                        <#else >
                        <a class="dropdown-item" href="/orders">Все заказы</a>
                        <a class="dropdown-item" href="#">Последний заказ</a>
                        <!--<div class="dropdown-divider"></div>-->
                        </#if>
                </div>
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Заказы
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="/logout">Выход</a>
            </li>
        </ul>

    </div>
</nav>



<#if  model.operator??>

<div class="container pt-1 pl-3">
    <div class="row pt-3">
        <div class="col-2"></div>
        <div class="col-8 border border-dark p-3">

            <p class="h5 text-center pt-2">Список  заказов</p>
            <div class="d-table">
                <div class="d-table-row pt-2">
                    <div class="h6 d-table-cell  mx-auto pt-1 pr-3 pl-3">Номер заказа</div>
                    <#--<div class="h6  d-table-cell pt-1 pr-5 ">Общая цена</div>-->
                    <div class="h6  d-table-cell pt-1 pr-5">Дата заказа</div>
                    <div class=" h6 d-table-cell pt-1 pr-5">Статус заказа</div>
                    <div class="h6  d-table-cell pt-1 pr-5">Профиль заказа</div>
                </div>
            </div>
            <#list model.orders as orders>

            <div class="d-table-row">
                <div class="d-table-cell  mx-auto pt-2 pr-5 pl-5">      ${orders.id}</div>
                <#--<div class="d-table-cell pt-1 pr-5 ">${orders.number}</div>-->
                <div class="d-table-cell pt-2  pr-5">${orders.time}</div>
                <div class="d-table-cell pt-2 pr-5">${orders.orderStatus}</div>
                <div class="d-table-cell pt-2 pr-5"><a href="/operator/showGoods?id=${orders.id}">Посмотреть заказ</a></div>
                <#if  model.user??>
                <#else >
                <div class="d-table-cell  pt-2 pr-5 pl-8"><button class="btn btn-success" onclick="changeOrderStatus(${orders.id})">Сменить статус</button>
                </#if>

                </div>


        </div>

                         </#list>


        </div>

    </div>

</div>

</#if>



<#if  model.operator??>
<#else>
<div class="container pt-1 pl-3">
    <div class="row pt-3">
        <div class="col-2"></div>
        <div class="col-8 border border-dark p-3">

            <p class="h5 text-center pt-2">Список  заказов</p>
            <div class="d-table">
                <div class="d-table-row pt-2">
                    <div class="h6 d-table-cell  mx-auto pt-1 pr-3 pl-3">Номер заказа</div>
                <#--<div class="h6  d-table-cell pt-1 pr-5 ">Общая цена</div>-->
                    <div class="h6  d-table-cell pt-1 pl-5 pr-5">Дата заказа</div>
                    <div class=" h6 d-table-cell pt-1 pr-5">Статус заказа</div>
                    <div class="h6  d-table-cell pt-1 pr-5">Профиль заказа</div>
                </div>
            </div>

            <#list model.orders as orders>

            <div class="d-table-row">
                <div class="d-table-cell  mx-auto pt-2 pr-5 pl-5">${orders.id}</div>
            <#--<div class="d-table-cell pt-1 pr-5 ">${orders.number}</div>-->
                <div class="d-table-cell pt-2  pr-5">${orders.time}</div>
                <div class="d-table-cell pt-2 pr-5">${orders.orderStatus}</div>
                <div class="d-table-cell pt-2 pr-5"><a href="/operator/showGoods?id=${orders.id}">Посмотреть заказ</a></div>
                <#if  model.user??>
                <#else >
                <div class="d-table-cell  pt-2 pr-5 pl-8"><button class="btn btn-success" onclick="changeOrderStatus(${orders.id})">Сменить статус заказа</button>
                </#if>

            </div>


            </#list>
        </div>



        </div>

    </div>

</div>
</#if>

<!--TODO: здесь требуется разобраться как считать корзину-->



<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="/js/main.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css"/>

</body>
</html>










<#--<html>-->
<#--<head>-->
    <#--<head>-->
        <#--<meta charset="UTF-8">-->
        <#--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>-->
        <#--<script src="/js/main.js"></script>-->
        <#--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
        <#--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->

        <#--<title>Товары</title>-->
    <#--</head>-->
<#--</head>-->
<#--<body>-->
<#--<table>-->
    <#--<tr>-->
        <#--<th>numberOrder<th>-->
        <#--<th>time</th>-->
        <#--<th>number</th>-->
        <#--<th>status</th>-->

    <#--</tr>-->
    <#--<#list orders as orders>-->
        <#--<tr>-->
            <#--<td>${orders.id}</td>-->
            <#--<td>${(orders.time)!"Пусто"}</td>-->
            <#--<td>${(orders.number)!}</td>-->
            <#--<td id="${orders.id}">${(orders.orderStatus)!}</td>-->
            <#--<#if user??>-->
            <#--<#else>-->
                <#--<td><a href="/operator/showGoods?id=${orders.id}">Посмотреть заказ</a></td>-->
            <#--</#if>-->

            <#--<#if user??>-->
            <#--<#else>-->
            <#--<td>-->
                <#--<div>-->
                    <#--<button onclick="changeOrderStatus(${orders.id})">Сменить статус</button>-->
                <#--</div>-->
            <#--</td>-->
            <#--</#if>-->
        <#--</tr>-->
    <#--</#list>-->

<#--</table>-->
<#--<br>-->
<#--<td><a href="/profile">Вернуться в профиль</a></td>-->

<#--</body>-->
<#--</html>-->
