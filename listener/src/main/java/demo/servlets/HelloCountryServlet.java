package demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloCountryServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest request,
                     HttpServletResponse response) throws IOException {
    doGet(request,response);
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response) throws IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    request.getSession();

    out.println("<h3>Hello India!</h3>");
    out.println("Admin: " + request.getServletContext().getAttribute("admin"));
    out.println("<br/>Total Active Session: "+ request.getServletContext().getAttribute("activeSessions"));
  }
}
