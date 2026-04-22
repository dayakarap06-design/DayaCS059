

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        process(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        out.println("<h2>Factorial of " + num + " is " + fact + "</h2>");
    }
}