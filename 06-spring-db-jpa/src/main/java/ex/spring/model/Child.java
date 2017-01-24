package ex.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity(name="grade")
public class Child implements Serializable {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long sid;
  
  @JoinColumn(name = "parentId")
  private Long parentId;
  
  public Long getSid() {
    return sid;
  }

  public void setSid(Long sid) {
    this.sid = sid;
  }
  
  
  public Long get성적표() {
      return parentId;
  }

  public void set성적표(Long bookCategory) {
      this.parentId = bookCategory;
  }
}
