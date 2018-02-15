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
                <a class="nav-link" href="/profile">Профиль <span class="sr-only">(current)</span></a>
            </li>

            <#if user.role=="USER">
            <li class="nav-item">
                <a class="nav-link" href="/profile/goods">Товары</a>
            </li>
            </#if>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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


<div class="container pb-3 pt-2">

    <div class="row">
        <br>
        <div class="col-md-6 offset-md-5"
        <div class="text-center h2 "> Редактирование профиля</div>
        <p>
    </div>
    <div class="row">
        <div class="col-md-6 offset-md-5"
            <ul>
            <li class="pt-2 pb-2">
        <input type="text" id="name" <#if user.name??>
    value="${user.name}"
        <#else> placeholder="${(user.name)!}"
        </#if>>
            </li>

            <li class="pt-1 pb-2">
        <input type="text" id="telephone" <#if user.telephone??>
    value="${user.telephone}"
        <#else> placeholder="${(user.telephone)!}"
        </#if>>
            </li>
            <li class="pt-1 pb-2">

        <input type="text" id="address" <#if user.address??>
    value="${user.address}"
        <#else> placeholder="Не заполнено"
        </#if>>
            </li>
            <li>

        <button class="button btn-dark pt" onclick="updateProfileForUser(document.getElementById('name').value,
                                          document.getElementById('telephone').value,
                                          document.getElementById('address').value)">Сохранить</button>
            </li>

        </ul>
    </div>
    </div>
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






