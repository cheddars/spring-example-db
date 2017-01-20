package ex.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ex.spring.dao.ArticleRepository;
import ex.spring.model.Article;

@Service
public class BoardServiceImpl implements BoardService {
	private static Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	@Autowired private ArticleRepository articleRepository;
	
	@Override
	public List<Article> list() {
		log.info("boardService.list()");
		return articleRepository.findAll();
	}

	@Override
	public Article view(Long id) {
		log.info("boardService.view()");
		return articleRepository.getOne(id);
	}

}
