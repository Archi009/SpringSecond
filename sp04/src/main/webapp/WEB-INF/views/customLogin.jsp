<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Custom Login Page</h1>
	<h2>
		<c:out value="${error}" />
	</h2>
	<h2>
		<c:out value="${logout}" />
	</h2>
<!-- post와 login은 내가 설정한 controller가 인식하는게 아니라  security가 인식한다. -->
	<form method='post' action="login">
		<div>
			<input type='text' name='username' value='admin'>
		</div>
		<div>
			<input type='password' name='password' value='1234'>
		</div>
		<div>
			<input type='checkbox' name='remember-me'> Remember Me
		</div>
		<div>
			<input type='submit'>
		</div>
		<!-- session에 따라 csrf token이 변화한다. -->
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> 
	</form>
</body>
</html>