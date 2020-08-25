package demo.listeners;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCountListener implements HttpSessionListener {

  private final AtomicInteger sessionCount = new AtomicInteger();

  @Override
  public void sessionCreated(HttpSessionEvent se) {
    sessionCount.incrementAndGet();
    setActiveSessionCount(se);
  }

  @Override
  public void sessionDestroyed(HttpSessionEvent se) {
    sessionCount.decrementAndGet();
    setActiveSessionCount(se);
  }

  private void setActiveSessionCount(HttpSessionEvent se) {
    se.getSession().getServletContext()
      .setAttribute("activeSessions", sessionCount.get());
    System.out.println("Total Active Session: " + sessionCount.get());
  }
}
