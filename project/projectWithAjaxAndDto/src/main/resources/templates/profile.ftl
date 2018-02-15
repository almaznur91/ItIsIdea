<#ftl encoding='UTF-8'>
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
                <a class="nav-link" href="#">Профиль <span class="sr-only">(current)</span></a>
            </li>

            <#if user.role=="USER">
            <li class="nav-item">
                <a class="nav-link" href="/profile/goods">Товары</a>
            </li>
            </#if>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">
                    Заказы
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">

                    <#if user.role=="USER">
                        <a class="dropdown-item" href="/orders">Все заказы</a>
                        <a class="dropdown-item" href="#">Последний заказ</a>
                    <#else >
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

<div class="container ">
    <div class="row pt-2">
        <div class="col-2"></div>
        <div class="col-8 pt-3 ">
            <div class="row border border-dark p-3 align-items-center">
                <div class="col-6 ">
                    <img width='200' src="${(user.imageUrl)!}" class=" row rounded mx-auto d-block" alt="...">


                </div>
                <div class="col-6">
                    <div class="d-table">
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Имя:</div>
                            <div class="d-table-cell ">${(user.name)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Логин:</div>
                            <div class="d-table-cell ">${(user.userLogin)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Email:</div>
                            <div class="d-table-cell ">${(user.email)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Адрес:</div>
                            <div class="d-table-cell ">${(user.address)!}</div>
                        </div>

                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Номер телефона:</div>
                            <div class="d-table-cell ">${(user.telephone)!}</div>
                        </div>


                    </div>

                    <div class="d-table-row">
                        <div class="d-table-cell pb-1 pt-1 pr-2 pl-2"><input type="file" name="file" id="fileInput"
                                                                        placeholder="Файл фото"></div>
                    </div>

                    <div class="d-table-row">
                        <div class="d-table-cell pb-3 pt-1 pr-2 pl-2">
                            <button class="col-auto btn btn-success"
                                    onclick="imageUpload(document.getElementById('fileInput')['files'][0])">Сменить аватарку
                            </button>
                        </div>
                    </div>
                    <div class="d-table-row">
                        <div class="d-table-cell pt-1 pr-2 pl-2">
                            <a class="btn btn-dark" href="/editUser" role="button">Редактировать профиль</a>

                        </div>
                    </div>
                </div>

            </div>


        </div>


    </div>
</div>


<!--TODO: здесь требуется разобраться как считать корзину-->


    <#if user.role=='USER'>
    <nav class=" navbar fixed-bottom container navbar navbar-dark navbar-expand-sm bg-dark justify-content-between ">
        <a class="navbar-brand " href="/basket">Корзина</a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent1">
        </div>

        <form class="form-inline">
            <div class="text-info text-light pr-3 h6">Сумма заказа</div>
            <div class="form-control mr-sm-2">${sum} руб.</div>
            <a class="btn btn-outline-success my-2 my-sm-0" role="button" href="/checkout" type="submit">Оформить
                заказ</a>
        </form>
    </nav>
    </#if>

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





















<#--<h3>Профиль</h3>-->
<#--<div id="avatar">-->

<#--<#if user.imageUrl??>-->
<#--<img class="img-circle" width='100' height='100' src="${user.imageUrl}">-->
<#--</#if>-->
<#--</div>-->
<#--<h4>${(user.name)!}</h4>-->
<#--<h4>${user.email}</h4>-->
<#--<h4>${user.userLogin}</h4>-->
<#--<head>-->
<#--<meta charset="UTF-8">-->
<#--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>-->
<#--<script src = "/js/main.js"></script>-->
<#--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
<#--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->

<#--<title>Товар через дто</title>-->
<#--</head>-->



<#--<div>-->
<#--<h5>Редактирование профиля</h5>-->
<#--<input type="text" id="name" <#if user.name??>-->
<#--value="${user.name}"-->
<#--<#else> placeholder="Не заполнено"-->
<#--</#if>>-->

<#--<input type="text" id="name" <#if user.telephone??>-->
<#--value="${user.telephone}"-->
<#--<#else> placeholder="Не заполнено"-->
<#--</#if>>-->

<#--<input type="text" id="name" <#if user.address??>-->
<#--value="${user.address}"-->
<#--<#else> placeholder="Не заполнено"-->
<#--</#if>>-->

<#--<button onclick="updateProfileForUser(document.getElementById('name').value,-->
<#--document.getElementById('telephone').value,-->
<#--document.getElementById('address').value)">Сохранить</button>-->
<#--</div>-->
<#--<br>-->
<#--<div>-->
<#--<h5>Сменить фото аватара</h5>-->
<#--<input type="file" name = "file" id = "fileInput" placeholder="Файл фото">-->
<#--<button onclick="imageUpload(document.getElementById('fileInput')['files'][0])">Загрузить</button>-->

<#--</div>-->





