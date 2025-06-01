<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="register.css">
<title>Register</title>
</head>
<body>
<div class="main">
<h1>Register</h1>
<form action="RegisterServlet" method="post">
<label for="name">Name: </label>
<input type="text" id="name" name="name" placeholder="Enter your name" required>
<label for="email">Email: </label>
<input type="email" id="email" name="email" placeholder="Enter your email" required>

<label for="pass">Password: </label>
<input type="password" id="pass" name="password" placeholder="Enter your password" required>
<button type="submit">Register</button>


</form>
<p><a href="index.html">Back to Home</a></p>
</div>
</body>
</html>