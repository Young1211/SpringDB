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
	<h1>Tigerview</h1>
	<a href="t9">Lion</a>
	<br />
	<a href="<c:url value = 'index.jsp'/>">home</a>
	<br/>
	
	<ul>
	<c:forEach var = "im" items = "${apple}">
	<li><c:out value = "${im}"></c:out></li>
	</c:forEach>
	</ul>
	
	
	

</body>
</html>