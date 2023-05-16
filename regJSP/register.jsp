<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Result</title>
</head>
<body>
    <%
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        // Check if passwords match
        if (!password.equals(confirmPassword)) {
    %>
            <h2>Passwords do not match. Please try again.</h2>
            <a href="registration.jsp">Back to Registration</a>
    <%
        } else {
            // Registration Successful
    %>
            <h2>Welcome <%=firstName%>! You are successfully registered.</h2>
    <%
        }
    %>
</body>
</html>
