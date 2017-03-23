<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My WebApp</title>
</head>
<body>
<form action="/login" method="post">
<p><font color="red">${errorMessage}</font></p>
<p>NAME: <input type = "text" name = "name"/></p>
<p>
PASSWORD: <input type = "password" name = "password"/>
</p>
<input type = "submit" value = "Submit">
</form>
</body>
</html>