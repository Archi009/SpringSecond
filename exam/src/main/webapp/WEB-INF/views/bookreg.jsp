<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/includes/header.jsp"%>
<form name="regForm">
	<table class="table">
		<tbody>
			<tr>
				<th>도서번호</th>
				<td><input name="book_no" type="text" value="${bookno +1 }"></td>
			</tr>
			<tr>
				<th>도서명</th>
				<td><input name="book_name" type="text"></td>
			</tr>
			<tr>
				<th>도서표지</th>
				<td><input name="book_coverimg" type="text"></td>
			</tr>
			<tr>
				<th>출판일자</th>
				<td><input name="book_date" type="date"></td>
			</tr>
			<tr>
				<th>금액</th>
				<td><input name="book_price" type="text"></td>
			</tr>
			<tr>
				<th>출판사</th>
				<td><input name="book_publisher" type="text"></td>
			</tr>
			<tr>
				<th>도서소개</th>
				<td><textarea name="book_info" id=""></textarea></td>
			</tr>

		</tbody>
	</table>
	<div>
		<button id="regBtn">등록</button>
		<button>조회</button>
	</div>
</form>
<%@include file="/WEB-INF/views/includes/footer.jsp"%>
<script>
    document.querySelector("#regBtn").addEventListener('click',function(e){
        e.preventDefault()
        
        let data = new FormData(document.regForm)
    let entries = data.entries();
for (const pair of entries) {
    // console.log(pair[0]+ ', ' + pair[1]); 
    if(pair[1] == ''){
        if(pair[0]=='book_info'){
             target.focus()
             alert(target.parentElement.parentElement.children[0].innerHTML+"이 입력되지 않았습니다.")
             break;
        }else{
              let target = document.querySelector(`input[name ='\${pair[0]}']`);
            target.focus()
            alert(target.parentElement.parentElement.children[0].innerHTML+"이 입력되지 않았습니다.")
            break;
        }

    }
}





       fetch('http://localhost:8081/exam/book/reg', {
                    method: 'POST',
                  
                    body: data 
                    })
                    .then((response) => response.json())
                    .then((data) => {
                        console.log(data);
                        if(data>0){
                        	location.href='http://localhost:8081/exam/book/list'
                        }
                    });
    })
   
</script>