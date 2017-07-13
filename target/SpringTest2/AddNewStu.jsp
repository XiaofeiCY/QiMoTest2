<%--
  Created by IntelliJ IDEA.
  User: XFXF
  Date: 2017/7/5
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="MyStuAction!AddNewOne" method="post">
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <td>ID</td>
            <td>姓名</td>
            <td>年龄</td>
        </tr>
        <tr>
            <td><input type="text" name="stuno"/></td>
            <td><input type="text" name="name"/></td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" value="点击提交"/></td>
        </tr>
    </table>
</form>
</body>
</html>
