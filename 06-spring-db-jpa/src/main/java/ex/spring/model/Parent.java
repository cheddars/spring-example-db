package ex.spring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="sheet")
public class Parent  {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  
  @Embedded private User user;
  
  private String 평균;
  private Long 석차;
  private String 성명;
  
//  @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
  @JoinColumn(name="parentId")
  private List<Child> 중간고사;
  
//  @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
//  @JoinColumn(name="id")
//  private List<성적> 기말고사;
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String get평균() {
    return 평균;
  }
  public void set평균(String 평균) {
    this.평균 = 평균;
  }
  public Long get석차() {
    return 석차;
  }
  public void set석차(Long 석차) {
    this.석차 = 석차;
  }
  public String get성명() {
    return 성명;
  }
  public void set성명(String 성명) {
    this.성명 = 성명;
  }
  public List<Child> get중간고사() {
    return 중간고사;
  }
  public void set중간고사(List<Child> 중간고사) {
    this.중간고사 = 중간고사;
  }
//  public List<성적> get기말고사() {
//    return 기말고사;
//  }
//  public void set기말고사(List<성적> 기말고사) {
//    this.기말고사 = 기말고사;
//  }
  public void setUser(User user2) {
    this.user = user2;
  }
  

}
