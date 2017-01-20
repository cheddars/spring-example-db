package ex.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ex.spring.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
  Article getOne(Long id);
}
