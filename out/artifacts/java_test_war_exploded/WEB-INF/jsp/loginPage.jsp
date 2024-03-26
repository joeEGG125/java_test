<%--
  Created by IntelliJ IDEA.
  User: wisem
  Date: 2024/2/29
  Time: 下午 05:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginPage</title>
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
    <!-- 引入 CryptoJS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/crypto-js/4.0.0/crypto-js.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

</head>
<body>
<%--<form action="${pageContext.request.contextPath}/loginVerify" method="post">--%>
<div>
    <div style="margin-top: 10px">
        <span style="padding-left: 44px">ID:</span>
        <input type="text" id="id">
    </div>
    <div style="margin-top: 10px">
        <span style="padding-left: 23px">Name:</span>
        <input type="text" id="name">
    </div>
    <div style="margin-top: 10px">
        <span>Password:</span>
        <input type="text" id="password">
    </div>
    <div style="margin-top: 10px; padding-left: 20px">
        <button type="button" class="add">增加</button>
        <button type="button" class="delete">刪除</button>
        <button type="button" class="update">更新</button>
        <button type="button" class="login">使用者查詢</button>
    </div>
    <div style="margin-top: 10px; padding-left: 109.5px">
        <button type="button" class="clearAll">清空全部欄位+畫面</button>
    </div>
</div>

<div style="background-color: beige" id="userInfo"></div>
<%--</form>--%>
<script>
    //增加
    $('.add').click(function () {
        var id = $('#id').val();
        var name = $('#name').val();
        var password = $('#password').val();
        clearAll()

        const userInputFile = {
            id: id,
            name: name,
            password: password
        }
        const userJsonData = JSON.stringify(userInputFile);
        fetch("/loginPage/addUser", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: userJsonData
        })
            .then(response => response.text())
            .then(data => {
                $('#userInfo').append('<p>訊息: ' + data + '</p>');
            });
    })
    //刪除
    $('.delete').click(function () {
        var id = $('#id').val();
        clearAll()

        fetch("/loginPage/delete", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: 'id=' + encodeURIComponent(id)
        })
            .then(response => response.text())
            .then(data => {
                $('#userInfo').append('<p>訊息: ' + data + '</p>');
            });
    })
    //更新
    $('.update').click(function () {
        var id = $('#id').val();
        var name = $('#name').val();
        var password = $('#password').val();
        clearAll()

        const userInputFile = {
            id: id,
            name: name,
            password: password
        }
        const userJsonData = JSON.stringify(userInputFile);
        fetch("/loginPage/update", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: userJsonData
        })
            .then(response => response.text())
            .then(data => {
                $('#userInfo').append('<p>訊息: ' + data + '</p>');
            });
    })
    //使用者資訊查詢
    $('.login').click(function () {
        var id = $('#id').val();
        if (id === "") {
            id = null;
        }
        var name = $('#name').val();
        if (name === "") {
            name = null;
        }
        var password = $('#password').val();
        clearAll()

        const userInputFile = {
            id: id,
            name: name,
            password: password
        }

        const userJsonData = JSON.stringify(userInputFile);

        fetch("/loginPage/loginVerifyFront", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: userJsonData
        })
            .then(response => response.json())
            .then(data => {
                data.forEach(function(user) {
                    $('#userInfo').append('<p>User ID: ' + user.id + '</p>' + '<p>Name: ' + user.name + '</p>' +'<p>Password: ' + user.password + '</p>' + '<br>');
                });
            });
    });

    $('.clearAll').click(function () {
        clearAll()
    })

    function clearAll() {
        $('#id').val("");
        $('#name').val("");
        $('#password').val("");
        $('#userInfo').empty();
    }
</script>
</body>
</html>
