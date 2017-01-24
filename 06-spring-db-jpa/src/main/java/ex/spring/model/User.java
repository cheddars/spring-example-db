package ex.spring.model;

import javax.persistence.Embeddable;

@Embeddable
public class User {
  private String home;

  public User(){}
  
  public User(String string) {
    this.home = string;
  }

  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }
}
