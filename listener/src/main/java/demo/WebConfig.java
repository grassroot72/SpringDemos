package demo;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import demo.filters.ABCFilter;
import demo.filters.XYZFilter;
import demo.listeners.AdminInfoListener;
import demo.listeners.SessionCountListener;
import demo.servlets.HelloCountryServlet;
import demo.servlets.HelloStateServlet;

@Configuration
public class WebConfig {
  //Register SessionCountListener
  @Bean
  public ServletListenerRegistrationBean<SessionCountListener> sessionCountListener() {
    ServletListenerRegistrationBean<SessionCountListener> listenerRegBean = new ServletListenerRegistrationBean<>();
    listenerRegBean.setListener(new SessionCountListener());
    return listenerRegBean;
  }

  //Register AdminInfoListener
  @Bean
  public ServletListenerRegistrationBean<AdminInfoListener> adminInfoListener() {
    ServletListenerRegistrationBean<AdminInfoListener> listenerRegBean = new ServletListenerRegistrationBean<>();
    listenerRegBean.setListener(new AdminInfoListener());
    return listenerRegBean;
  }

  //Register ABCFilter
  @Bean
  public FilterRegistrationBean<ABCFilter> abcFilter() {
    FilterRegistrationBean<ABCFilter> filterRegBean = new FilterRegistrationBean<>();
    filterRegBean.setFilter(new ABCFilter());
    filterRegBean.addUrlPatterns("/app/*");
    filterRegBean.setOrder(Ordered.LOWEST_PRECEDENCE -1);
    return filterRegBean;
  }

  //Register XYZFilter
  @Bean
  public FilterRegistrationBean<XYZFilter> xyzFilter() {
    FilterRegistrationBean<XYZFilter> filterRegBean = new FilterRegistrationBean<>();
    filterRegBean.setFilter(new XYZFilter());
    filterRegBean.addUrlPatterns("/app/*");
    filterRegBean.setOrder(Ordered.LOWEST_PRECEDENCE -2);
    return filterRegBean;
  }

  //Register HelloCountryServlet
  @Bean
  public ServletRegistrationBean<HelloCountryServlet> countryServlet() {
    ServletRegistrationBean<HelloCountryServlet> servRegBean = new ServletRegistrationBean<>();
    servRegBean.setServlet(new HelloCountryServlet());
    servRegBean.addUrlMappings("/app/country/*");
    servRegBean.setLoadOnStartup(1);
    return servRegBean;
  }

  //Register HelloStateServlet
  @Bean
  public ServletRegistrationBean<HelloStateServlet> stateServlet() {
    ServletRegistrationBean<HelloStateServlet> servRegBean = new ServletRegistrationBean<>();
    servRegBean.setServlet(new HelloStateServlet());
    servRegBean.addUrlMappings("/app/state/*");
    servRegBean.setLoadOnStartup(1);
    return servRegBean;
  }
}
