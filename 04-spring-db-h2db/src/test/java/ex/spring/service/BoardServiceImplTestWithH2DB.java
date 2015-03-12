package ex.spring.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ex.spring.model.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations={"/ctx.xml","/spring-db-h2db.xml"})
public class BoardServiceImplTestWithH2DB {
	@Autowired private BoardService board;
	
	@Before
	public void setUp(){
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
