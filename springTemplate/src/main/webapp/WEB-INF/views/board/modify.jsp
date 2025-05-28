<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<div>
		<h1>Board Modify</h1>
	</div>
</div>

<div>
	<div>
		<div>
			<div>Board Modify</div>
			<div>
			<form action='<c:url value="/board/modify" />' method="post">
				<input type="hidden" name="bno" value="${board.bno }"/>
				<div>
					<label>Title</label> <input name='title' value="${board.title }">
				</div>
				
				<div>
				 <label>Text area</label>
				 <textarea rows="3" name='content'>${board.content}</textarea>
				</div>
				<div>
					<label>Writer</label> <input name='writer' value="${writer }">
				</div>
				<button type="submit">submit</button>
				<button type="reset">reset</button>
			</form>
			</div>
		</div>
	</div>
</div>

</body>
</html>