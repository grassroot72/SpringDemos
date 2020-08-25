package demo;

public class HelloWorld {

  private String message;

  public void setMessage(final String message) {
    this.message = message;
  }

  public String getMessage(){
    return message + "[This is from HelloWorld class]";
  }

}
