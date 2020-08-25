package demo.service;

import demo.model.User;

public interface UserService {
  public User findUserByEmail(String email) ;
  public User saveUser(User user);
}
