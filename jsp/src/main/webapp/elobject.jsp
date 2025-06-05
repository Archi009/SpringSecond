<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elobject (express language)</title>
</head>
<body>

	<% // eltag가 찾아오는 순서 page -> request -> session -> application
		request.setAttribute("username", "홍길동");
		session.setAttribute("username", "토토로");
		request.setAttribute("list", Arrays.asList("월요일","좋아","설마"));
	%>
	
username :	${username }<br>
session username :  ${sessionScope.username }<br>
parameter : ${param.age }  <%=request.getParameter("age") %><br> <!-- 주소?age=000 -->
parameter : ${params.age }  <%=request.getParameterValues("age") %><br> <!-- 주소?age=000 -->
header    : ${header["user-Agent"] } <%= request.getHeader("user-Agent") %><br>
header    : ${header.Host } <%= request.getHeader("Host") %><br>
ip addr    : ${pageContext.request.remoteAddr } <%= request.getRemoteAddr() %><br>
cookie  : ${cookie }
<ul>
	<c:forEach var="week" items="${list}">
		<li>${week}</li>
	</c:forEach>
</ul>

</body>
</html>