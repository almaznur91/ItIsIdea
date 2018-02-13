



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

            <li class=" nav-item active">
                <a class="nav-link" href="#">Профиль <span class="sr-only">(current)</span></a>
            </li>


            <li class="nav-item">
                <a class="nav-link" href="/profile/goods">Товары</a>
            </li>
             <#if userAdmin.role=="ADMIN">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Заказы
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">


                    <a class="dropdown-item" href="/operator">Все заказы</a>


                </div>
            </li>
             </#if>
            <li class="nav-item">
                <a class="nav-link disabled" href="/logout">Выход</a>
            </li>
        </ul>

    </div>
</nav>

<div class="container ">
    <div class="row">
        <div class="col-2"></div>
        <div class="col-8 pt-3 ">
            <div class="row border border-dark p-3">
                <div class="col-6 ">
                    <img  width='200'  src="/files/${(userAdmin.image.storageFileName)!}" class=" row rounded mx-auto d-block" alt="...">
                    <input type="file" name = "file" id = "fileInput" placeholder="Файл фото">
                    <button class="col-auto btn btn-success" onclick="imageUpload(document.getElementById('fileInput')['files'][0])">Сменить фото</button>

                </div>
                <div class="col-6">
                    <div class="d-table">
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Имя: </div>
                            <div class="d-table-cell ">${(userAdmin.name)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Логин: </div>
                            <div class="d-table-cell ">${(userAdmin.userLogin)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Email: </div>
                            <div class="d-table-cell ">${(userAdmin.email)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Адрес: </div>
                            <div class="d-table-cell ">${(userAdmin.address)!}</div>
                        </div>
                        <div class="d-table-row">
                            <div class="d-table-cell pt-1 pr-2 pl-2">Номер телефона: </div>
                            <div class="d-table-cell ">${(userAdmin.telephone)!}</div>
                        </div>
                    </div>
                </div>



            </div>





        </div>
    </div>

    <div>
        <h5>Редактирование имени</h5>
        <input type="text" id="name" <#if userAdmin.name??>
    value="${userAdmin.name}"
        <#else> placeholder="Не заполнено"
        </#if>>
        <button onclick="updateProfileForModerator(document.getElementById('name').value)">Сохранить</button>
    </div>


    <!--TODO: здесь требуется разобраться как считать корзину-->



    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src = "/js/main.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>

















<#--<#ftl encoding='UTF-8'>-->
<#--<#import 'spring.ftl' as spring>-->
<#--<h3>Профиль</h3>-->
<#--<h3>${(userAdmin.name)!}</h3>-->
<#--<h4>${userAdmin.email}</h4>-->
<#--<h4>${userAdmin.userLogin}</h4>-->
<#--<head>-->
    <#--<meta charset="UTF-8">-->
    <#--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>-->
    <#--<script src = "/js/main.js"></script>-->
    <#--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
    <#--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->

    <#--<title>Товар через дто</title>-->
<#--</head>-->

<#--<div id="avatar">-->

        <#--<#if (userAdmin.image.storageFileName)??>-->
            <#--<img class="img-circle" width='100' height='100' src="/files/${userAdmin.image.storageFileName}">-->
        <#--</#if>-->
<#--</div>-->


<#--<br>-->
<#--<div>-->
    <#--<h5>Сменить фото аватара</h5>-->
    <#--<input type="file" name = "file" id = "fileInput" placeholder="Файл фото">-->
    <#--<button onclick="imageUpload(document.getElementById('fileInput')['files'][0])">Загрузить</button>-->

<#--</div>-->

<#--<br>-->

<#--<a href="/logout">Выход</a>-->
<#--<a href="/profile/goods" >Список товаров</a>-->

<#--<#if userAdmin.role=="ADMIN">-->
<#--<a href="/operator" >Список заказов</a>-->
<#--</#if>-->
