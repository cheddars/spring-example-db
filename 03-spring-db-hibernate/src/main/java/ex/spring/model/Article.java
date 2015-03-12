package ex.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Article {
	@Id
	@Column(columnDefinition = "serial")
	private int seq;
	@Column private String title;
	@Column private String content;
	
	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public Article() {
	}

	public int getSeq(){
		return seq;
	}
	
	public void setSeq(int seq){
		this.seq = seq;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("seq : ").append(seq).append(", ")
			.append("title : ").append(title).append(", ")
			.append("content : ").append(content).append("\n");
		return sb.toString();
	}
}
