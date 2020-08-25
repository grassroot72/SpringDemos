package demo.config;

// import org.h2.server.web.WebServlet;
// import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BeanConfiguration implements WebMvcConfigurer {
  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    return bCryptPasswordEncoder;
  }

  // @Bean
  // ServletRegistrationBean<WebServlet> h2servletRegistration() {
  //   final ServletRegistrationBean<WebServlet> registrationBean = new ServletRegistrationBean<WebServlet>(new WebServlet());
  //   registrationBean.addUrlMappings("/console/*");
  //   return registrationBean;
  // }
}
