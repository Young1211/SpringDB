<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<thead>
			<tr>
			<th>이름</th>
			<th>나이</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="array" items="${array}">
		<tr>
		<td>${array.getName()}</td>
		<td>${array.getAge()}</td>
		</tr>
		</c:forEach>
		
		</tbody>
	</table>


</body>
</html>