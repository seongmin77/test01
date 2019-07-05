<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%  request.setCharacterEncoding("UTF-8");%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과</title>
</head>
<body>
	아이디 : ${userID }<br>
	이름 : ${userName } <hr>
	
	아이디 : ${info.userID }<br>
	이름 : ${info.userName } <hr>
</body>
</html>












