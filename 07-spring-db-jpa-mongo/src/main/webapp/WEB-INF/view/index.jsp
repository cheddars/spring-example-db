<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Board</title>
		<style type="text/css">
			.board { border: 1px solid #888; border-collapse: collapse; width : 800px; }
			.board th { border: 1px solid #888; border-collapse: collapse; }
			.board td { border: 1px solid #888; border-collapse: collapse; }
		</style>
	</head> 
	<body>
		<div>
			<table class="board">
				<thead>
					<tr>
						<th>SEQ</th>
						<th>Title</th>
						<th>Content</th>
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${not empty list}">
							<c:forEach items="${list}" var="item">
								<tr>
									<td>${item.seq}</td>
									<td>${item.title}</td>
									<td>${item.content}</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr><td colspan="3">No Items.</td></tr>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
		</div>
		<div>
			<span>등록하기</span>
			<form name="writeForm" action="/write.html" method="post">
				<label>제목 : </label><input name="title" /><br/>
				<label>내용 : </label><textarea name="content" rows="10" cols="30"></textarea>
				<button>등록</button>
			</form>
		</div>
	</body>
</html>
