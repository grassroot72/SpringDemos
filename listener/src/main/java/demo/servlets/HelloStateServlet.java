package demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloStateServlet extends HttpServlet   {

  private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest request,
                     HttpServletResponse response) throws IOException {
    doGet(request,response);
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html");
    request.getSession();

    PrintWriter out = response.getWriter();
    out.println("<h3>Hello Uttar Pradesh!</h3>");
    out.println("Admin: " + request.getServletContext().getAttribute("admin"));
    out.println("<br/>Total Active Session: "+ request.getServletContext().getAttribute("activeSessions"));
  }
}
