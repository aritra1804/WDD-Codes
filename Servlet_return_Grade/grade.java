import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class GradeServlet extends HttpServlet {
  
  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      
    // Retrieve the marks entered by the user
    int mark1 = Integer.parseInt(request.getParameter("mark1"));
    int mark2 = Integer.parseInt(request.getParameter("mark2"));
    int mark3 = Integer.parseInt(request.getParameter("mark3"));
    int mark4 = Integer.parseInt(request.getParameter("mark4"));
    int mark5 = Integer.parseInt(request.getParameter("mark5"));

    // Calculate the total marks and percentage scored
    int totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;
    double percentage = totalMarks / 5.0;

    // Assign a grade based on the percentage
    String grade;
    if (percentage >= 90) {
      grade = "A+";
    } else if (percentage >= 80) {
      grade = "A";
    } else if (percentage >= 70) {
      grade = "B";
    } else if (percentage >= 60) {
      grade = "C";
    } else if (percentage >= 50) {
      grade = "D";
    } else {
      grade = "F";
    }

    // Return the grade as a response to the client
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    out.println("<h2>Your Grade is: " + grade + "</h2>");
    out.println("</body></html>");
  }
}
