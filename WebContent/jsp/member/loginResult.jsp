<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		
	<h1>로그인 결과</h1>
	
	입력한 아이디: ${param.id }<br />
	입력한 패스워드: ${param.pwd }<br />
	<p />
	<h3>${msg }</h3>
	<p />
	<a href="/210122ex/jsp/common/menu.jsp">홈으로 이동</a>
	</div>

</body>
</html>