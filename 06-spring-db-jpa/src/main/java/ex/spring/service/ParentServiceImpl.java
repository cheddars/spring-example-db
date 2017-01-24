package ex.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ex.spring.dao.ParentRepository;
import ex.spring.model.User;
import ex.spring.model.Child;
import ex.spring.model.Parent;

@Service
public class ParentServiceImpl implements ParentService {
	private static Logger log = LoggerFactory.getLogger(ParentServiceImpl.class);
	@Autowired private ParentRepository 성적Repository;
	
	@Override
	public void save(Long id) {
		log.info("성적Service.save()");
		Parent b = new Parent();
		b.set성명("이현수");
		b.setUser(new User("homevalue"));
		성적Repository.save(b);
		
		System.out.println(b.getId());
		List<Child> m = new ArrayList<>();
		Child e = new Child();
		e.set성적표(b.getId());
//		e.setParentId(parentId);
    m.add(e);
    
        Child e2 = new Child();
    e2.set성적표(b.getId());
//    e.setParentId(parentId);
    m.add(e2);
    
    b.set중간고사(m);
    성적Repository.save(b);
	}

}
