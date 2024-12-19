<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>客户端一：个人信息</title>
</head>
<body>
<h1>客户端一：个人信息</h1>
用户名：${user.username}<br>

<h3>在线用户如下</h3>
<c:forEach items="${web1Users}" var="u">
    <tr align="center">
        <td>用户:</td>
        <td>${u.username}</td>
        <td>----</td>
        <td>登录时间:</td>
        <td>${u.dateTime}</td>
    </tr>
    <br>
</c:forEach>
<a href="/web1_war/LogoutServlet">退出登录</a>
<br>
<a href="http://localhost:9009/web3_war/">跳转到Web2</a>
</body>
</html>
