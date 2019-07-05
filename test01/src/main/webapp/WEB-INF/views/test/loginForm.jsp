<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%  request.setCharacterEncoding("UTF-8");%>    
<c:set var="contextPath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	로그인입니다.<br>
	<form action="${contextPath }/test/login4" method="post">
		아이디 : <input type="text" name="userID"><br>
		이름 : <input type="text" name="userName"><br>
		<input type="submit">
		<input type="reset">
		
	
	</form>
</body>
</html>





