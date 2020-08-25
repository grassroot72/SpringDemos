package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

  @Autowired
  HelloWorld hello1;

  @Autowired
  HelloSpring hello2;

  @RequestMapping("/greeting1")
  public @ResponseBody String greeting1() {
    hello1.setMessage("Hello World - ");
    return hello1.getMessage();
  }

  @RequestMapping("/greeting2")
  public @ResponseBody String greeting2() {
    hello2.setMessage("Hello Spring - ");
    return hello2.getMessage();
  }
}
