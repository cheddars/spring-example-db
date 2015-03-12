package ex.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ex.spring.dao.BoardDao;
import ex.spring.model.Article;

public class BoardServiceImpl implements BoardService {
	private static Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	private BoardDao boardDao;
	
	public void setBoardDao(BoardDao boardDao){
		this.boardDao = boardDao;
	}
	
	@Override
	public List<Article> list() {
		log.info("boardService.list()");
		return boardDao.list();
	}

	@Override
	public void write(Article article) {
		log.info("boardService.write()");
		boardDao.write(article);
	}

	@Override
	public Article view(String id) {
		log.info("boardService.view()");
		return boardDao.view(id);
	}

	@Override
	public void deleteAll() {
		log.info("boardService.deleteAll()");
		boardDao.deleteAll();
	}
	

	
}
