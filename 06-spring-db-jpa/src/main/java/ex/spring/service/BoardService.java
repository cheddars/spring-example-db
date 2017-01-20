package ex.spring.service;

import java.util.List;

import ex.spring.model.Article;

public interface BoardService {
	List<Article> list();
	Article view(Long id);
}
