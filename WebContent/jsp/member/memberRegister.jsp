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
		<h1>Welcome!</h1>
		${param.name }<br /> 
		${param.id }<br /> 
		${paramValues.hobby[0] }
		${paramValues.hobby[1] }
		${paramValues.hobby[2] }
		${paramValues.hobby[3] }<br />
		${param.gender }<br /> 
		${param.tel }<br />
	</div>

	<div align="center">
		<a href="index.jsp">홈으로 이동</a>
	</div>

</body>
</html>