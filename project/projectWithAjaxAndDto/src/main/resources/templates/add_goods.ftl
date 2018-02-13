<#ftl encoding='UTF-8'>

<html>
<head>
    <meta charset="UTF-8">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="/js/main.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <title>Товар через дто</title>
</head>
<body>


    <div>
        <input type="text" id="name" placeholder="Имя">
        <input type="text" id="price" placeholder="Цена">
        <input type="text" id="kcal" placeholder="ККал">
        <input type="text" id="weight" placeholder="Вес">
        <input type="text" id="status" placeholder="Статус">
        <button onclick="addGoods(document.getElementById('name').value,
                                    document.getElementById('price').value,
                                    document.getElementById('kcal').value,
                                    document.getElementById('weight').value,
                                    document.getElementById('status').value)
                                    ">Сохранить</button>



    </div>

    <br>
    <input type="file" name="file" id="fileInput" placeholder="Файл фото">
    <button onclick="imageUpload(document.getElementById('fileInput')['files'][0])">Загрузить</button>
</form>
</body>


</html>

