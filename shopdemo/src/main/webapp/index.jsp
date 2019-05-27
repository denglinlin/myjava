<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>电子商城首页</title>
</head>
<body>
     <c:if test="${empty loginUser }">
       <li><a href="${pageContext.request.contextPath }/login.jsp">登录</a></li>
       <li><a href="${pageContext.request.contextPath }/register.jsp">注册</a></li>
     </c:if>
     <li><a href="">购物车</a></li>
     <c:if test="${not empty loginUser }">
         欢迎: ${loginUser.username },
         <li><a href="">我的订单</a></li>
         <li><a href="">退出</a></li>
     </c:if>
     
     <c:forEach items="${allCategory }" var="category">
        <li value="${category.cid }"><a href="">${category.cname}</a></li>
     </c:forEach>
</body>
</html>