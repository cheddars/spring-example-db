package ex.spring.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex.spring.model.Article;

public class BoardServiceImplTest {
	private BoardService board;
	
	@Before
	public void setUp(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "ctx.xml" });
		board = (BoardService) ctx.getBean(BoardService.class);
		board.deleteAll();
	}

	@Test
	public void testList() {
		assertTrue(board.list().size() == 0);
	}

	@Test
	public void testWrite() {
		assertTrue(board.list().size() == 0);
		
		Article article = new Article("title", "content");
		board.write(article);
		
		assertTrue(board.list().size() == 1);
	}

	@Test
	public void testView() {
		assertTrue(board.list().size() == 0);
		
		Article article = new Article("title", "content");
		board.write(article);
		
		assertTrue(board.list().size() == 1);
		
		assertNotNull(board.view(board.list().get(0).getSeq()));
	}

	@Test
	public void testDeleteAll() {
		board.deleteAll();
		assertTrue(board.list().size() == 0);
	}

}
