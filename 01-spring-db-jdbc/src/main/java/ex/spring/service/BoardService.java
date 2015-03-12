package ex.spring.service;

import java.util.List;

import ex.spring.model.Article;

public interface BoardService {
	List<Article> list();
	void write(Article article);
	Article view(String id);
	void deleteAll();
}
