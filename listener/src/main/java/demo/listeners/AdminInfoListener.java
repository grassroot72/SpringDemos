package demo.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AdminInfoListener implements ServletContextListener {

  @Override
  public void contextInitialized(final ServletContextEvent sce) {
    System.out.println("ServletContextEvent initialized.");
    final ServletContext sc = sce.getServletContext();
    sc.setAttribute("admin", "Edward");
  }

  @Override
  public void contextDestroyed(final ServletContextEvent sce) {
    final ServletContext sc = sce.getServletContext();
    sc.removeAttribute("admin");
    System.out.println("ServletContextEvent destroyed.");
  }
}
