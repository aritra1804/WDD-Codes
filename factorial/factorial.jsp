<!DOCTYPE html>
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.io.*,java.util.*,javax.servlet.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.jsp.*" %>
<html>
  <head>
    <title>Factorial Result</title>
  </head>
  <body>
    <h1>Factorial Result</h1>
    <%!
      int factorial(int n) {
        if (n == 0 || n == 1) {
          return 1;
        } else {
          return n * factorial(n - 1);
        }
      }
    %>
    <%
      int number = Integer.parseInt(request.getParameter("number"));
      int result = factorial(number);
    %>
    <p>The factorial of <%= number %> is <%= result %>.</p>
    
  </body>
</html>
