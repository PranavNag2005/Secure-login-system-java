<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="register.css">
</head>
<body>
<div class="main">
<h1>Login</h1>
<form action="Loginservlet" method="post">
<label for="name">Name: </label>
<input type="text" id="name" name="username" placeholder="Enter your name" required>
<label for="pass">Password: </label>
<input type="password" id="pass" name="password" placeholder="Enter your password" required>
<button type="submit">Login</button>


</form>
<p><a href="index.html">Back to Home</a></p>
<%String error=request.getParameter("error");
if(error!=null && error.equals("1")){%>
	<p style="color:cyan;font-weight:bold;">Invalid username or password </p>
	<p style="color:cyan;font-weight:bold;">please try again</p>
<%}
%>
</div>
</body>
</html>