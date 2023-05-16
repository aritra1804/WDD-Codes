import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    // Get the entered username and password
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // Connect to the database
    String url = "jdbc:mysql://localhost:3306/mydatabase";
    String dbUsername = "root";
    String dbPassword = "password";
    Connection conn = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(url, dbUsername, dbPassword);

      // Retrieve the stored password for the entered username
      String sql = "SELECT password FROM users WHERE username=?";
      PreparedStatement statement = conn.prepareStatement(sql);
      statement.setString(1, username);
      ResultSet result = statement.executeQuery();

      // Compare the entered password with the stored password
      if (result.next()) {
        String storedPassword = result.getString("password");
        if (storedPassword.equals(password)) {
          // Passwords match, allow the user to login
          HttpSession session = request.getSession();
          session.setAttribute("username", username);
          response.sendRedirect("home.jsp");
        } else {
          // Passwords don't match, display an error message
          request.setAttribute("errorMessage", "Invalid username or password");
          RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
          dispatcher.forward(request, response);
        }
      } else {
        // No user with the entered username, display an error message
        request.setAttribute("errorMessage", "Invalid username or password");
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
      }
    } catch (SQLException | ClassNotFoundException ex) {
      throw new ServletException("Login failed", ex);
    } finally {
      if (conn != null) {
        try {
          conn.close();
        } catch (SQLException ex) {
          throw new ServletException("Failed to close connection", ex);
        }
      }
    }
  }
}
