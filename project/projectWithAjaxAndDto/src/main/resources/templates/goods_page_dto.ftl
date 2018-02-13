<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>


<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src = "/js/main.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <title>Товар через дто</title>
</head>
<body>

<div>

    <input type="file" name = "file" id = "fileInput" placeholder="Файл фото">
    <button onclick="photoUpload(document.getElementById('fileInput')['files'][0], ${goods.id})">Загрузить</button>

        <br>

</div>
<div>
    <input type="text" id="name" <#if goods.name??>
        value = "${goods.name}"
        <#else> placeholder= "НЕ заполнено!"
    </#if>>

    <input type="text" id="kcal" <#if goods.kcal ??>
    value="${goods.kcal}"
    <#else> placeholder="Не заполнено!"
    </#if>>

    <input type="text" id="price" <#if goods.price ??>
           value="${goods.price}"
    <#else> placeholder="Не заполнено!"
    </#if>>

    <button onclick="updateGoods(document.getElementById('name').value,
                                 document.getElementById('kcal').value,
                                 document.getElementById('price').value,
                                 ${id})
                                 ">Сохранить</button>

</div>

    <div id="avatar">
         <#if (goods.image.storageFileName)??>
            <img class="img-circle" width='100' height='100' src="/files/${goods.image.storageFileName}">
         </#if>

    </div>



</body>
</html>

