<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/includes/header.jsp" %>
	
    <table class="table">
        <thead>
            <tr>
                <th>도서번호</th>
                <th>도서명</th>
                <th>대여총계</th>
                <th>대여횟수</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="list" items="${list }"> 
            <tr>
                <td>${list.book_no }</td>
                <td>${list.book_name }</td>
                <td>${list.rent.rent_price }</td>
                <td>${list.rent.rent_status }</td>
            </tr>
            </c:forEach>
        </tbody>

    </table>
	
	
<%@include file="/WEB-INF/views/includes/footer.jsp" %>