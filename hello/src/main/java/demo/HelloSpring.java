package demo;

public class HelloSpring {

  private String message;

  public void setMessage(final String message) {
    this.message = message;
  }

  public String getMessage(){
    return message + "[This is from HelloSpring class]";
  }
}
