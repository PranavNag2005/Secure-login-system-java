<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List,conn.servlet.User" %> <!-- Import required classes -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
    <style>
        /* Beautiful Background */
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(120deg, #3498db, #8e44ad);
            color: white;
            text-align: center;
            padding: 20px;
        }

        h2 {
            font-size: 28px;
            margin-bottom: 20px;
        }

        /* Centering the table */
        .container {
            display: flex;
            justify-content: center;
        }

        /* Styled Table */
        table {
            border-collapse: collapse;
            width: 80%;
            background: white;
            color: black;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
        }

        th, td {
            padding: 12px;
            text-align: center;
            border-bottom: 2px solid #ddd;
        }

        th {
            background-color: #2c3e50;
            color: white;
        }

        tr:hover {
            background-color: #f4f4f4;
        }

        /* No Users Found Message */
        .no-users {
            font-size: 18px;
            font-weight: bold;
            color: #f1c40f;
        }
    </style>
</head>
<body>

<h2>🌟 User Details 🌟</h2>
<div class="container">
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            
        </tr>

        <%
            List<User> userList = (List<User>) request.getAttribute("userList");
            if (userList != null && !userList.isEmpty()) {
                for (User user : userList) {
        %>
        <tr>
            <td><%= user.getId() %></td>
            <td><%= user.getName() %></td>
            <td><%= user.getEmail() %></td>
          
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="4" class="no-users">No users found.</td>
        </tr>
        <%
            }
        %>
    </table>
</div>

</body>
</html>