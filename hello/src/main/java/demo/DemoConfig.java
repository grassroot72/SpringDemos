package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

  @Bean
  public HelloWorld helloWorld() {
    return new HelloWorld();
  }

  @Bean
  public HelloSpring helloSpring() {
    return new HelloSpring();
  }
}
