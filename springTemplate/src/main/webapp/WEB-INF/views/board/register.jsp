<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="row">
		<div class="col-lg-12">
			<h1>Board Register</h1>
		</div>
	</div>
	
	<div>
		<div>
			<div>
				<div>Board Register</div>
				<div>

					<!-- <form action="register" method="POST" >-->
					<form action='<c:url value="/board/register" />' method="POST" > <!-- classpath?? -->
						<div><label >title</label><input type="text" name="title"></div>
						<div><label >content</label><input type="text" name="content"></div>
						<div><label >writer</label><input type="text" name="writer"></div>
						<button type="submit">Submit</button><button type="reset">Reset</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>