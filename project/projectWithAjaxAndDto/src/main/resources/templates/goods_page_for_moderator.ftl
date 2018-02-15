<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>



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
    <script src = "/js/main.js"></script>
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

            <li class=" nav-item active pr-2">
                <a class="btn btn-primary" href="/addGoods" role="button">Добавить новый товар <span class="sr-only">(current)</span></a>
            </li>

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
                        <th scope="col">Статус</th>
                        <th scope="col"></th>
                    </tr>
                    </thead>
                    <tbody>

                <#list model.goods as goods>

                <tr>
                    <td><#if (goods.image.storageFileName)??>

                        <p><a href="/oneGoods?id=${goods.id}">
                            <img class="img-circle" width='100' height='100' src="/files/${goods.image.storageFileName}"></a></p>
                    </#if></td>
                    <td class="align-middle">${(goods.name)!}</td>
                    <td class="align-middle">${(goods.weight)!} г</td>
                    <td class="align-middle">${(goods.kcal)!} кКал</td>
                    <td class="align-middle">${(goods.price)!} руб.</td>
                    <td class="align-middle">${(goods.status)!} </td>

                    </td>
                    <td class="align-middle"><a href="/goods/delete?id=${goods.id}">Снять</a></td>
                    <td class="align-middle"><a href="/goods/publish?id=${goods.id}">Опубликовать </a></td>
                    <td class="align-middle"><a href="/goods/updateGoods?id=${goods.id}">Изменить </a></td>

                </tr>
                </#list>
                    </tbody>

                </table>


            </div>


        </div>


    </div>














<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src = "/js/main.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


</body>
</html>
