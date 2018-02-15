<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <!--<link rel="stylesheet" href="css/bootstrap.min.css"/>-->
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/main.css"/>
    <title>Hello, world!</title>
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
            <li class="nav-item">
                <a class="nav-link" href="/goods">Товары</a>
            </li>

            <li class="nav-item">
                <a class="nav-link disabled" href="/logout">Выход</a>
            </li>
        </ul>

    </div>
</nav>



<div class="container">
    <div class="row pt-2">
        <div class="col-4"></div>
        <div class="col-4">
            <div class="text-info mx-auto h4 text-dark">Страница товара</div>

        </div>
        <div class="col-4"></div>
    </div>

</div>

<div class="container ">
    <div class="row">
        <div class="col-1"></div>
        <div class="col-10 pt-1 ">
            <div class="row border p-3">
                <div class="col-6 ">
                    <img width="400" src="/files/${(goods.image.storageFileName)!}" class=" pb-4 row rounded mx-auto d-block" alt="...">


                </div>
                <div class="col-6">
                    <div class="d-table my-auto pt-5">
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Название товара: </div>
                            <div class="d-table-cell ">${(goods.name)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Вес: </div>
                            <div class="d-table-cell ">${(goods.weight)!} г.</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Энергия: </div>
                            <div class="d-table-cell ">${(goods.kcal)!} кКал</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Цена: </div>
                            <div class="d-table-cell h6">${(goods.price)!} руб.</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pb-3 pr-2 pl-2"> </div>
                            <div class="d-table-cell "> </div>
                        </div>

                    </div>
                    <div class="d-table-row">
                        <div class="d-table-cell "> Описание товара:
                            ${(goods.specification)! "Отсутствут"}</div>
                    </div>

                </div>
                <#if user.getRole()=='USER'>
                <button onclick="addToBasket1(${goods.id})" class="col-6 btn btn-success">Добавить в корзину</button>
                </#if>

            </div>





        </div>
    </div>








<#--<br>-->
<#--<div id="avatar">-->
         <#--<#if (goods.image.storageFileName)??>-->

             <#--<p><a href="/goods/add_to_basket?id=${goods.id}">-->
                 <#--<img class="img-circle" width='400' src="/files/${goods.image.storageFileName}"></a></p>-->
         <#--</#if>-->

<#--</div>-->
<#--<br>-->
<#--<table>-->

        <#--<tr>-->
            <#--<td>-->

            <#--</td>-->
            <#--<td>${goods.id}</td>-->
            <#--<td>${(goods.name)!"Пусто"}</td>-->
            <#--<td>${goods.price}</td>-->
            <#--<td>${(goods.kcal)!}</td>-->


        <#--</tr>-->




<#--</table>-->














</body>
</html>
