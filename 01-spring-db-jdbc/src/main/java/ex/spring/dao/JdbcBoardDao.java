package ex.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ex.spring.model.Article;

@Repository
public class JdbcBoardDao implements BoardDao {
	
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public void write(Article article) {
		jdbcTemplate.update("INSERT INTO board (title, content) values (?, ?)",
			article.getTitle(),
			article.getContent()
		);
	}

	@Override
	public List<Article> list() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM board");
		List<Article> resultList = new ArrayList<Article>();
		if(list != null){
			for(Map<String, Object> item : list){
				Article a = new Article((String) item.get("title"), (String) item.get("content"));
				a.setSeq(String.valueOf(item.get("seq"))); 
				resultList.add(a);
			}
		}
		return resultList;
	}

	@Override
	public Article view(String seq) {
		Article obj = namedParameterJdbcTemplate.queryForObject(
				"SELECT * FROM board where seq = :seq", 
				new MapSqlParameterSource("seq", Integer.valueOf(seq)),
				new RowMapper<Article>(){
					@Override
					public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
						Article a = new Article();
						a.setSeq(String.valueOf(rs.getInt("seq")));
						a.setTitle(rs.getString("title"));
						a.setContent(rs.getString("content"));
						return a;
					}
					
				});
		return obj;
	}

	@Override
	public void deleteAll() {
		jdbcTemplate.update("DELETE FROM board");
	}

}
