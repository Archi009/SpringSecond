<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp.jsp</title>
</head>
<body>
<h3>MVC 패턴</h3>
		<table>
			<tr>
				<!-- 처음언 '<'  '%''=''%''>'같은 방식만 있었다 -->
			 	<td><%=request.getAttribute("name") %></td>
			 	<!-- el 태그 -->
			 	<td>${name }</td>
			 	<td><%=request.getAttribute("dept") %></td>
			 	<td>${dept }</td>
			</tr>
		</table>
</body>
</html>