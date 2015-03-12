package ex.spring.bo;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ex.spring.dao.BoardDao;
import ex.spring.model.Article;

@Service
public class ArticleBO implements BoardDao {
	
	@Resource private SessionFactory sessionFactory;
	
	@Override
	public List<Article> list(){
		Session ses = sessionFactory.openSession();
		List<Article> articleList = (List<Article>) ses.createCriteria(Article.class).list();
		return articleList;
	}
	
	@Override
	public void write(Article a){
		Session ses = sessionFactory.openSession();
		ses.save(a);
		ses.flush();
	}

	@Override
	public Article view(String id) {
		Session ses = sessionFactory.openSession();
		Article article = (Article) ses.get(Article.class, Integer.valueOf(id));

		return article;
	}

	@Override
	public void deleteAll() {
		Session ses = sessionFactory.openSession();
		Query q = ses.createQuery("DELETE FROM Article");
		q.executeUpdate();
	}
	
	
}
