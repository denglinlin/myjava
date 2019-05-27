<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/register" method="post">
  用户名:<input type="text" name="username" placeholder="请输入用户名"><br>
  密码:<input type="password" name="password" placeholder="请输入密码"><br>
  确认密码:<input type="password" name="repassword" placeholder="请输入密码"><br> 
  电话:<input type="text" name="phone"><br>
   性别:男<input type="radio" name="sex" value="男">
      女<input type="radio" name="sex" value="女"><br> 
      <input type="submit" value="提交">
</form>
</body>
</html>