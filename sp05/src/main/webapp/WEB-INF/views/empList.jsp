<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>스프링 컨트롤러 연스</h3>
	<!-- 절대경로 컨텍스트패스부터 시작 -->
	<img src="/sp05/image/apple.jpg"/>
	
	<!-- 절대경로 c:url 태그 사용 -->
	<img src="<c:url value="/image/apple.jpg"/>"/>
	
	<!-- 상대경로 -->
	<img src="../image/apple.jpg"/>
	${servertime}
</body>
</html>