<#--<#ftl encoding='UTF-8'>-->

<#--<html>-->
<#--<head>-->
<#--<meta charset="UTF-8">-->
<#--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>-->
<#--<script src="/js/main.js"></script>-->
<#--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
<#--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->

<#--<title>Товар через дто</title>-->
<#--</head>-->
<#--<body>-->

<#--<form>-->
<#--<div>-->
<#--<input type="text" id="name" placeholder="Имя">-->
<#--<input type="text" id="price" placeholder="Цена">-->
<#--<input type="text" id="kcal" placeholder="ККал">-->
<#--<input type="text" id="weight" placeholder="Вес">-->
<#--<input type="text" id="status" placeholder="Статус">-->
<#--<input type="text" id="specification" placeholder="Описание">-->
<#--<button onclick="addGoods(document.getElementById('name').value,-->
<#--document.getElementById('price').value,-->
<#--document.getElementById('kcal').value,-->
<#--document.getElementById('status').value),-->
<#--document.getElementById('weight').value,-->
<#--document.getElementById('specification').value)-->
<#--">Сохранить</button>-->



<#--</div>-->

<#--<br>-->
<#--<input type="file" name="file" id="fileInput" placeholder="Файл фото">-->
<#--<button onclick="imageUpload(document.getElementById('fileInput')['files'][0])">Загрузить</button>-->
<#--</form>-->
<#--</body>-->


<#--</html>-->









<#--<#ftl encoding='UTF-8'>-->


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
            <div class="text-info mx-auto h4 text-dark">Страница добавления товара</div>

        </div>
        <div class="col-4"></div>
    </div>

</div>

<form action="/addGoods" method="post" enctype="multipart/form-data">
    <div class="form-row pt-4">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer01">Наименование товара</label>
        </div>
        <div class="col-md-3 mb-3">
            <input type="text" class="form-control" name="name" placeholder="Кока-кола"
                   required>

        </div>
        <div class="col-3"></div>
    </div>

    <div class="form-row pt-1">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer01">Цена,руб</label>
        </div>
        <div class="col-md-3 mb-3">
            <div class="input-group">

                <input type="text" class="form-control" name="price" placeholder="999"
                       aria-describedby="inputGroupPrepend3" required>
            </div>
        </div>
        <div class="col-3"></div>
    </div>


    <div class="form-row pt-1">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer01">Ценность,кКал</label>
        </div>
        <div class="col-md-3 mb-3">
            <input type="text" class="form-control" name="kcal" placeholder="111" required>

        </div>
        <div class="col-3"></div>
    </div>

    <div class="form-row pt-2">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer04">Вес,г.</label>
        </div>
        <div class="col-md-3 mb-3">
            <input type="text" class="form-control" name="weight" placeholder="321" required>

        </div>
        <div class="col-3"></div>
    </div>


    <div class="form-row pt-1">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer01">Статус</label>
        </div>
        <div class="col-md-3 mb-3">
            <input type="text" class="form-control" name="status" placeholder="СONFIRMED/NOT_CONFIRMED" required>

        </div>
        <div class="col-3"></div>
    </div>
    <div class="form-row pt-1">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer01">Описание</label>
        </div>
        <div class="col-md-3 mb-3">
            <input type="text" class="form-control" name="specification" placeholder="Особая кола" required>

        </div>
        <div class="col-3"></div>
    </div>

    <div class="form-row pt-1">
        <div class="col-3"></div>
        <div class="col-2">
            <label class="float-right pr-3 pt-2 h6" for="validationServer01">Фото</label>
        </div>
        <div class="col-md-3 mb-3">
            <div class="custom-file">
                <input type="file" class="custom-file-input" name="photo">
                <label class="custom-file-label" for="customFile">Choose file</label>
            </div>
        </div>
        <div class="col-3"></div>
    </div>

    <div class="form-row pt-1">
        <div class="col-3"></div>
        <div class="col-2">
        </div>
        <div class="form-group">
            <div class="form-check">

                <button class="btn btn-primary" type="submit">Сохранить
                </button>

            </div>
        </div>
        <div class="col-3"></div>
    </div>
</form>


<!--TODO: здесь требуется разобраться как считать корзину-->


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
