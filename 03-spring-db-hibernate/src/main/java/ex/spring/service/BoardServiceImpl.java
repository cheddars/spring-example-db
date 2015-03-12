package ex.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ex.spring.bo.ArticleBO;
import ex.spring.model.Article;

@Service
public class BoardServiceImpl implements BoardService {
	private static Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	@Autowired private ArticleBO articleBo;
	
	@Override
	public List<Article> list() {
		log.info("boardService.list()");
		return articleBo.list();
	}

	@Override
	public void write(Article article) {
		log.info("boardService.write()");
		articleBo.write(article);
	}

	@Override
	public Article view(String id) {
		log.info("boardService.view()");
		return articleBo.view(id);
	}

	@Override
	public void deleteAll() {
		log.info("boardService.deleteAll()");
		articleBo.deleteAll();
	}
}
