<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="register.css">
<meta charset="UTF-8">
<title>Forgot password</title>
</head>
<body>
<div class="main">
<h1>Forgot Password</h1>
<form action="ForgotServlet" method="post">
<label for="name">Name: </label>
<input type="text" id="name" name="username" placeholder="Enter your name" required>
<label for="pass">Password: </label>
<input type="password" id="pass" name="password" placeholder="Enter your new password" required>
<button type="submit">Submit</button>


</form>


</div>
</body>
</html>