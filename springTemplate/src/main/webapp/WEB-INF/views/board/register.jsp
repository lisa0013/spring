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
		<h1>Board Register</h1>
	</div>
</div>

<div>
	<div>
		<div>
			<div>Board Register</div>
			<div>
			<form action='<c:url value="/board/register" />' method="post">
				<div>
					<label>Title</label> <input name='title'>
				</div>
				
				<div>
				 <label>Text area</label>
				 <textarea rows="3" name='content'></textarea>
				</div>
				<div>
					<label>Writer</label> <input name='writer'>
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