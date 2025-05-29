<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="/WEB-INF/views/includes/header.jsp" %>
<body>
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Board UPDATE</h1>
		</div>
	</div>
	
	<div class="row"> 
		<div class="col-lg-6">
			<div class="panel panel-default">
				<div class="panel-heading">Board UPDATE</div>
				<div class="panel-body">

					<!-- <form action="register" method="POST" >-->
					<form action='<c:url value="/board/update" />' method="POST" > <!-- classpath?? -->
					
						<div class="form-group"><label >bno</label><input class="form-control" type="text" name="bno" id="bno" value="${board.bno }" readonly="readonly"> </div>
						<div class="form-group"><label >title</label><input class="form-control" type="text" name="title" value="${board.title }"></div>
						<div class="form-group"><label >content</label><input class="form-control" type="text" name="content" value="${board.content }"></div>
						<div class="form-group"><label >writer</label><input class="form-control" type="text" name="writer" value="${board.writer }"></div>
						<button type="submit">Submit</button><button type="reset">Reset</button>
						<button id="delBtn">삭제</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	
<%@include file="/WEB-INF/views/includes/footer.jsp" %>
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