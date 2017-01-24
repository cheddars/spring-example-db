package ex.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class ParentServiceImpl implements ParentService {
	private static Logger log = LoggerFactory.getLogger(ParentServiceImpl.class);
	@Autowired private MongoTemplate mt;
//	@Autowired private ParentRepository 성적Repository;
	
	@Override
	public void save(Long id) {
		log.info("성적Service.save()");
		mt.save(new Person("lhs", 10));
//		Parent b = new Parent();
//		b.set성명("이현수");
//		b.setUser(new User("homevalue"));
//		성적Repository.save(b);
		
//		System.out.println(b.getId());
//		List<Child> m = new ArrayList<>();
//		Child e = new Child();
//		e.set성적표(b.getId());
//		e.setParentId(parentId);
//    m.add(e);
    
//        Child e2 = new Child();
//    e2.set성적표(b.getId());
//    e.setParentId(parentId);
//    m.add(e2);
//    
//    b.set중간고사(m);
//    성적Repository.save(b);
	}

}

class Person{
  private String name;
  private int age;
  
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
