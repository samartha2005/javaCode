package p1;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Simple Servlet to process form POST data
 */
@WebServlet(name = "asyncread", urlPatterns = {"/asyncread"})
public class asyncread extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the textarea content by its name attribute
        String content = request.getParameter("content");

        // Set response type and write content back
        response.setContentType("text/plain");
        response.getWriter().write("Received Data: " + content);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain");
        response.getWriter().write("Please use POST method with form submission.");
    }

    @Override
    public String getServletInfo() {
        return "Simple Servlet for async read simulation using synchronous form handling.";
    }
}
