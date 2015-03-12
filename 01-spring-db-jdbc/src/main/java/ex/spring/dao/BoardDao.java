package ex.spring.dao;

import java.util.List;

import ex.spring.model.Article;

public interface BoardDao {
	void write(Article article);
	List<Article> list();
	Article view(String id);
	void deleteAll();
	
}
