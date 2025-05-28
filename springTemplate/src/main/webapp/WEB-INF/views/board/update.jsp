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
			<h1>Board UPDATE</h1>
		</div>
	</div>
	
	<div>
		<div>
			<div>
				<div>Board UPDATE</div>
				<div>

					<!-- <form action="register" method="POST" >-->
					<form action='<c:url value="/board/update" />' method="POST" > <!-- classpath?? -->
					
						<div><label >bno</label><input type="text" name="bno" id="bno" value="${board.bno }" readonly="readonly"> </div>
						<div><label >title</label><input type="text" name="title" value="${board.title }"></div>
						<div><label >content</label><input type="text" name="content" value="${board.content }"></div>
						<div><label >writer</label><input type="text" name="writer" value="${board.writer }"></div>
						<button type="submit">Submit</button><button type="reset">Reset</button>
						<button id="delBtn">삭제</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>
<script>
document.querySelector("#delBtn").addEventListener('click', function(e){
	e.preventDefault()
	let bno = document.querySelector("input[name=bno]").value
	console.log(bno);
	
	
	fetch('del', {
	    method: 'post',
		headers : {'Content-type':'application/json; charset=utf-8'},
	    body: bno
	  })
	  .then(response => response.json()) // 응답을 JSON으로 파싱
	  .then(data => {
	    console.log(data); // 실제 데이터 사용
	  })
	  .catch(error => {
	    console.error('에러 발생:', error);
	  });
	  
})
</script>