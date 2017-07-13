<%@ taglib prefix="s" uri="/struts-tags" %>
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
<form action="MyStuAction!UpdateOne" method="post">
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <td>ID</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>操作</td>
        </tr>
        <s:iterator value="#request.student"  var="stu">
            <tr>
                <td><input name="stuno" type="text" value="<s:property value='#stu.stuno'/> "></td>
                <td><input name="name" type="text" value="<s:property value='#stu.name'/> "></td>
                <td><input name="age" type="text" value="<s:property value='#stu.age'/> "></td>
                <td><input type="submit" value="点击提交"/></td>
            </tr>
        </s:iterator>
    </table>
</form>
</body>
</html>
