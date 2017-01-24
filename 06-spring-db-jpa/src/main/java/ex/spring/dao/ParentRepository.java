package ex.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ex.spring.model.Parent;

public interface ParentRepository extends JpaRepository<Parent, Long> {
  Parent getOne(Long id);
  
  @Override
  Parent save(Parent b); 
}
