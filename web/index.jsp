<%--
  Created by IntelliJ IDEA.
  User: wisem
  Date: 2024/2/29
  Time: 上午 09:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/loginVerify" method="post">
  <div>
    <div style="margin-top: 10px">
      <span style="padding-left: 44px">ID:</span>
      <input type="text" name="id">
    </div>
    <div style="margin-top: 10px">
      <span style="padding-left: 23px">Name:</span>
      <input type="text" name="name">
    </div>
    <div style="margin-top: 10px">
      <span style="padding-left: 23px">Password:</span>
      <input type="text" name="encryptedPassword">
      <span style="color: red">必填</span>
    </div>
    <input style="margin-top: 10px; margin-left:198px" type="submit">
<%--    <button type="button" class="login">使用者資訊查詢</button>--%>
  </div>
  </form>
  </body>
</html>
