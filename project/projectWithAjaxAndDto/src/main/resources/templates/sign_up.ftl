<#ftl encoding='UTF-8'>

<#--<html>-->
<#--<body>-->
<#--<form method="post" action="/signUp">-->
      <#--<input type="text" name = "userLogin" placeholder="Логин"/>-->
        <#--<input type="text" name="email" placeholder="Email">-->
        <#--<input type="password" name="userPassword" placeholder="Пароль"/>-->
        <#--<input type="text" name="telephone" placeholder="Номер телефона">-->
        <#--<input type="text" name="address" placeholder="Адрес">-->
        <#--<input type="submit">-->
<#--</form>-->
<#--</body>-->


<#--</html>-->



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
    <div class="row pt-2">
        <div class="col-4"></div>
        <div class="col-4">
            <div class="text-info mx-auto h4 text-dark">Страница регистрации</div>

        </div>
        <div class="col-4"></div>
    </div>

</div>


<form method="post" action="/signUp">
    <div class="form-row pt-4">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer01">Логин</label>
        </div>
        <div class="col-md-3 mb-3">
            <input type="text" class="form-control" name="userLogin" placeholder="Логин"
                   required>

        </div>
        <div class="col-3"></div>
    </div>

    <div class="form-row pt-1">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer01">Email</label>
        </div>
        <div class="col-md-3 mb-3">
            <div class="input-group">

                <input type="text" class="form-control" name="email" placeholder="Email"
                       aria-describedby="inputGroupPrepend3" required>
            </div>
        </div>
        <div class="col-3"></div>
    </div>


    <div class="form-row pt-1">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer01">Адрес</label>
        </div>
        <div class="col-md-3 mb-3">
            <input type="text" class="form-control" name="address" placeholder="Город, улица, дом, квартира" required>

        </div>
        <div class="col-3"></div>
    </div>

    <div class="form-row pt-2">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer04">Телефонный номер</label>
        </div>
        <div class="col-md-3 mb-3">
            <input type="text" class="form-control" name="telephone" placeholder="+7 9**-***-**-**" required>

        </div>
        <div class="col-3"></div>
    </div>


    <div class="form-row pt-1">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer01">Пароль</label>
        </div>
        <div class="col-md-3 mb-3">
            <input type="password" class="form-control" name="userPassword" placeholder="не менее 8 символов" required>

        </div>
        <div class="col-3"></div>
    </div>

    <div class="form-row pt-1">
        <div class="col-3"></div>
        <div class="col-2">
        </div>
        <div class="form-group">
            <div class="form-check">
                <input class="form-check-input is-invalid" type="checkbox" value="" id="invalidCheck3" required>
                <label class="form-check-labe l" for="invalidCheck3">
                    Согласен с условиями
                </label>
                <div class="invalid-feedback pb-2">
                    Вы должны согласиться перед отправкой.
                </div>

                <button class="btn btn-primary" type="submit">Зарегистрироваться</button>

            </div>
        </div>
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