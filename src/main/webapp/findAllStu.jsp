<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<body>
    <h2>测试学生信息</h2>

    <form action="MyStuAction!Update" method="post">
        <table border="1" cellpadding="10" cellspacing="0">
            <tr>
                <th>ID</th>
                <th>姓名</th>
                <th>年龄</th>
                <th colspan="2">操作</th>
            </tr>
            <s:iterator value="#request.students" var="stu">
                <tr>
                    <td><s:property value="#stu.stuno"/> </td>
                    <td><s:property value="#stu.name"/> </td>
                    <td><s:property value="#stu.age"/> </td>
                    <td><a href="MyStuAction!delete?stuno=<s:property value='#stu.stuno'/>">删除</a></td>
                    <td><a href="MyStuAction!Update?stuno=<s:property value='#stu.stuno'/>">修改</a></td>
                </tr>
            </s:iterator>
            <tr>
                <td colspan="5"><a href="MyStuAction!AddOne">点击添加</a></td>
            </tr>
        </table>
    </form>
</body>
</html>
