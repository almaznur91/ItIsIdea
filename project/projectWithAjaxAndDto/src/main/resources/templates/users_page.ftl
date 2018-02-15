



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
            <li class="nav-item">
                <a class="nav-link" href="/goods">Товары</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/users">Пользователи</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Заказы
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/operator">Заказы</a>

                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="/logout">Выход</a>
            </li>
        </ul>

    </div>
</nav>





<div class="container pt-1 pl-3">
    <div class="row pt-3">
        <div class="col-1"></div>
        <div class="col-10 border border-dark p-3">

            <p class="h5 text-center pt-2">Список пользователей</p>
            <div class="d-table pl-5">
                <div class="d-table-row pt-2">
                    <div class="h6 d-table-cell  mx-auto pt-1 pl-1 pr-4">ID</div>
                    <div class="h6 d-table-cell  mx-auto pt-1 pr-3 pl-3">Логин</div>
                <#--<div class="h6  d-table-cell pt-1 pr-5 ">Количесвто заказов</div>-->
                    <div class="h6  d-table-cell pt-1 pl-5 pr-5">Имя</div>
                    <div class="h6  d-table-cell pt-1 pr-1">Роль пользователя</div>
                    <div class="h6  d-table-cell pt-1 pr-3 pl-1">Статус пользователя</div>
                </div>
            </div>

            <#list model.users as user>

            <div class="d-table-row">
            <#--<div class="d-table-cell pt-1 pr-5 ">${orders.number}</div>-->
                <div class="d-table-cell pt-2 pl-5">${user.id}</div>
                <div class="d-table-cell pt-2 pl-5 pr-5">${user.userLogin}</div>
                <#--<div class="d-table-cell pt-2  pr-5">${(sumorder)!}</div>-->
                <div class="d-table-cell pt-2 pr-5">${(user.name)!}</div>
                <div class="d-table-cell pt-2 pr-5">${(user.role)!}</div>
                <div class="d-table-cell pt-2 pr-5">${(user.state)!}</div>
                <div class="d-table-cell pt-2 pr-4"><a href="/users/changeRole?id=${user.id}">Сменить роль</a></div>
                <div class="d-table-cell pt-2 pr-3"><a href="/users/changeState?id=${user.id}">Сменить статус</a></div>


            </div>


            </#list>
        </div>



        </div>

    </div>

</div>

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
