<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>

<%@include file="/WEB-INF/views/includes/header.jsp" %>
    <div class="m-5">
        <h2 class="text-center">도서 조회/수정</h2>

    </div>
	<table class="table">
        <thead>
            <tr>
                <th>도서번호</th>
                <th>도서명</th>
                <th>표지</th>
                <th>출판일자</th>
                <th>금액</th>
                <th>출판사</th>
                <th>도서소개</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="list" items="${list }"> 
            <tr>
                <td>${list.book_no }</td>
                <td>${list.book_name }</td>
                <td><img src="/exam/resources/images/${list.book_coverimg }" alt="img" width="50px"> </td>
                <td><fmt:formatDate value="${list.book_date }" pattern="yyyy-MM-dd" /></td>
                <td>${list.book_price }</td>
                <td>${list.book_publisher }</td>
                <td>${list.book_info }</td>
            </tr>
		</c:forEach>
        </tbody>
    </table>
	
<%@include file="/WEB-INF/views/includes/footer.jsp" %>