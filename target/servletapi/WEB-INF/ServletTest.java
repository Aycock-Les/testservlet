import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/ServletTest"})

public class ServletTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String letter = request.getParameter("letter");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Letter to Santa </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3> Thank you, " + firstname + " " + lastname + ". Your letter has been sent!</h3><p>");
        out.println("Your letter:<p>");
        out.println(letter);
        out.println("</body>");
        out.println("</html>");
    }
}