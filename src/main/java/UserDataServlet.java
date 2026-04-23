import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String desig = request.getParameter("designation");

        // Server-side validation
        if (name == null || email == null || desig == null ||
            name.equals("") || email.equals("") || desig.equals("") ||
            !email.contains("@")) {

            response.getWriter().println("<h3>Invalid Input!</h3>");
            return;
        }

        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("desig", desig);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}