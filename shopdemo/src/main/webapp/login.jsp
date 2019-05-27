<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
用户名:<input type="text" name="username" placeholder="请输入用户名"><br>
密码:<input type="text" name="password" placeholder="请输入密码"><br>
<input type="submit" value="登录">
</form>
</body>
</html>