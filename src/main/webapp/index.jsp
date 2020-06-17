<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<head>
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.9.0/jquery.js"></script>
<title>메인 페이지</title>
</head>

<body>
<script type="text/javascript">
//json으로 전달
$.ajax({
	   url: 't15', //컨트롤러에 지정한 경로 입력
	   async: false,
	   dataType: 'json',
	   contextType: "application/json; ",
	   success: function(json) {
	      // 코드가 성공한 경우의 콜백함수
	      console.log(12);
	      console.log(json);
	   },
	   error: function(error) {
	     // 에러가 발생한 경우
	      console.log(error);
	   }}
	);

</script>

	<%=new Date()%>
	<h2>Hello World</h2>
	
	<a href="t15">db read</a>
	<br />
	<a href="t16">db insert</a>
	<br />
	<a href="t17">db update</a>
	<br />
	<a href="t18">db delete</a>
	<br />
	<br />
    <!-- 배열을 넘기고 배열을 받을 예정임 -->


</body>