function updateGoods(name, kcal, price, id, specification) {

    $.ajax({
        url: "/goods/update",
        type: "POST",
        data: {
            name: name,
            kcal: kcal,
            price: price,
            id: id,
            specification:specification
        },

        success:
            alert('Успешно')
    });
}

function changeOrderStatus(id) {

    $.ajax({
        url: "/operator/changeOrderStatus",
        type: "POST",
        data: {
            id: id
        },

        success: function (data) {
            $(document.getElementById(data.id)).html(data.orderStatus)
        },
        error: function () {
            alert(data)
        }


    });
}

function addGoods(name, price, kcal, weight, status, specification) {

    $.ajax({
        url: "/addGoods",
        type: "POST",
        data: {
            name: name,
            price: price,
            kcal: kcal,
            weight: weight,
            status: status,
            specification:specification
        },

        success:
            alert('Успешно')
    });
}


function imageUpload(file) {
    var formData = new FormData();
    formData.append("file", file);
    $.ajax({
        type: "POST",
        url: "/avatar",
        data: formData,
        contentType: false,
        processData: false,
        success: function (data) {
            $("#avatar").html("<img class=\"img-circle\" width='100' height='100' src='/files/" +
                data + "'/>");
        },
        error: function (data) {
            alert(data)
        }
    });
}

function updateProfileForModerator(name) {

    $.ajax({
        url: "/profile/update",
        type: "POST",
        data: {
            name: name

        },

        success:
            alert('Успешно')
    });
}

function updateProfileForUser(name, telephone, address) {

    $.ajax({
        url: "/profile/update",
        type: "POST",
        data: {
            name: name,
            telephone: telephone,
            address: address

        },

        success:
            alert('Успешно')
    });
}

function photoUpload(file, id) {
    var formData = new FormData();
    formData.append("file", file);
    formData.append("id", id)
    $.ajax({
        type: "POST",
        url: "/goods/photo",
        data: formData,
        contentType: false,
        processData: false,
        success: function (data) {
            $("#avatar").html("<img class=\"img-circle\" width='100' height='100' src='/files/" +
                data + "'/>");
        },
        error: function (data) {
            alert(data)
        }
    });
}

function deleteGoodsFromBasket(index, button) {
    $.get("/basket/delete",
        {
            id: index
        },
        function () {
            button.parentElement.parentElement.remove();
        }
    )

}

function addToBasket(id) {
    $.get("/goods/add_to_basket",
        {
            id: id
        },{}
    )
}
function addToBasket1(id) {
    $.get("/oneGoods",
        {
            id: id
        },{}
    )
}


