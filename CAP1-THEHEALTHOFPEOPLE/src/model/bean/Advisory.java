package model.bean;

public class Advisory {
	private int id;
	private String content;
	public Advisory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Advisory(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
