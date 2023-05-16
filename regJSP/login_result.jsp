<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Result</title>
</head>
<body>
    <%
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Check if email and password match
        if (email.equals("user@example.com") && password.equals("password")) {
    %>
            <h2>Welcome <%=email%>! You are successfully logged in.</h2>
    <%
        } else {
    %>
            <h2>Incorrect email or password. Please try again.</h2>
            <a href="login.jsp">Back to Login</a>
    <%
        }
    %>
</body>
</html>
