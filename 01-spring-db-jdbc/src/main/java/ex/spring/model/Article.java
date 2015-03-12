package ex.spring.model;

public class Article {
	private String seq;
	private String title;
	private String content;
	
	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public Article() {
	}

	public String getSeq(){
		return seq;
	}
	
	public void setSeq(String seq){
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
