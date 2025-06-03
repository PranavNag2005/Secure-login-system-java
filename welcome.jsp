<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="welcome.css">
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<% 
HttpSession session1=request.getSession(false);
if(session1!=null && session1.getAttribute("username")!=null){
String username=(String) session1.getAttribute("username");



%>

<div class="main">
<h1>Welcome to Coding World</h1>
<h2 style="color:cyan";><%= username %></h2>
<p>A digital hub for learning, communication, and collaboration bringing education to your fingertips.
 Stay informed, stay engaged, and explore a world of knowledge with our interactive school portal.
Let me know if you need any tweaks!
</p>
<p>Front-end Technologies: HTML,CSS</p>
<p>Back-end Technologies: JSP,SERVLETS,JDBC,MYSQL</p>
<p>Click here to <a href="logout.jsp">Logout</a></p>
<p>Click here to <a href="Viewservlet">ViewUsers</a></p>
<%}
else{
response.sendRedirect("login.jsp");
}%>
</div>
</body>
</html>
