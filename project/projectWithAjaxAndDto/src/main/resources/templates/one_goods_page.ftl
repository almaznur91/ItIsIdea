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
                <a class="nav-link" href="#">Профиль <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Товары</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Заказы
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Все заказы</a>
                    <a class="dropdown-item" href="#">Последний заказ</a>
                    <!--<div class="dropdown-divider"></div>-->
                    <a class="dropdown-item" href="#">Заказы</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Выход</a>
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
        <div class="col-2"></div>
        <div class="col-8 pt-1 ">
            <div class="row border p-3">
                <div class="col-6 ">
                    <img height="300" src="https://totosushi.ru/168-tm_large_default/koka-kola-05l.jpg" class=" row rounded mx-auto d-block" alt="...">


                </div>
                <div class="col-6">
                    <div class="d-table my-auto pt-5">
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Имя: </div>
                            <div class="d-table-cell ">100 кг</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Логин: </div>
                            <div class="d-table-cell ">100 kkal</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Email: </div>
                            <div class="d-table-cell ">1000 kkal</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Адрес: </div>
                            <div class="d-table-cell ">1000 kkal</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pb-3 pr-2 pl-2">Номер телефона: </div>
                            <div class="d-table-cell ">1000 kkal</div>
                        </div>

                    </div>
                    <div class="d-table-row">
                        <div class="d-table-cell "> Описание товара:
                            вааааааааааааааааааааааааааааааааааааа</div>
                    </div>

                </div>

                <button class="col-auto btn btn-success mx-auto ">Добавить в корзину</button>


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











<br>
    <a href="/profile/goods" >Вернуться к списку товаров</a>
<br>
    <a href="/profile" >Вернуться на странцу профиля</a>



</body>
</html>
