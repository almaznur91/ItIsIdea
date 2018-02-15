<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<#--<html>-->
<#--<body>-->
<#--&lt;#&ndash;<#if model.error??>&ndash;&gt;-->
    <#--&lt;#&ndash;<h1>Ошибка</h1>&ndash;&gt;-->
<#--&lt;#&ndash;</#if>&ndash;&gt;-->
<#--<form method="post" action="/signIn">-->
    <#--<input type="text" name="userLogin" placeholder="Логин">-->
    <#--<input type="password" name="userPassword" placeholder="Пароль">-->
    <#--<input type="checkbox" name="remember-me" placeholder="Запомнить">-->
    <#--<input type="submit">-->
<#--</form>-->
<#--</body>-->






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
                <a class="nav-link" href="/signUp">Регистрация <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/signIn">Войти</a>
            </li>

            <li class="nav-item">
                <a class="nav-link disabled" href="/logout">Выход</a>
            </li>
        </ul>

    </div>
</nav>


<!--TODO: здесь требуется разобраться как считать корзину-->


<div class="container">
    <div class="row pt-5">
        <div class="col-4"></div>
        <div class="col-4">
            <div class="text-info mx-auto h4 text-dark">Вход в аккаунт</div>

        </div>
        <div class="col-4"></div>
    </div>

</div>






<form method="post" action="/signIn">
    <div class="form-row pt-2">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="exampleInputEmail1">Логин аккаунта</label>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="userLogin"  placeholder="Логин">
            <small id="emailHelp" class="form-text text-muted"></small>
        </div>
        <div class="col-3"></div>
    </div>

    <div class="form-row pt-0">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="exampleInputPassword1">Password</label>
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="userPassword" placeholder="Password">
        </div>
        <div class="col-3"></div>
    </div>

    <div class="form-row pt-1">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-1 form-check-label" for="exampleCheck1">Запомнить</label>
        </div>
        <div class="form-check">
            <input type="checkbox" class="form-check-input pt-4 pr-3" name="remember-me">



        </div>
        <button type="submit" class="btn btn-primary pl-3">Войти</button>
        <div class="col-3"></div>
    </div>





</form>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src = "/js/main.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>