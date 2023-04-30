<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Index Page</h2>
	<hr>
	
	<form action="MessageServlet" method="post">
		Full Name <input type="text" name="fname"><br><br>
		Email ID <input type="text" name="email"><br><br>
		Subject <input type="text" name="sub"><br><br>
		Message <input type="text" name="msg"><br><br>
		
		<input type="submit" value="Send" >
	
	</form>
</body>
</html>