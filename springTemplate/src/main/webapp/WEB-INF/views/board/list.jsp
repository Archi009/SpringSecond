<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
<a href='register'>등록</a>
	<table class="table table=striped table-boarder table-hover">
		<thead>
		<tr>
		<th>#번호</th>
		<th>제목</th>
		<th>내용</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>수정일</th>
		</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="board">
				<tr>
					<td><c:out value="${board.bno }"></c:out></td>
					<td><a href='get?bno=${board.bno}'> ${board.title }"</a></td>
					<td><c:out value="${board.content }"></c:out></td>
					<td><c:out value="${board.writer }" /></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regdate }"/></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.updateDate }"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>