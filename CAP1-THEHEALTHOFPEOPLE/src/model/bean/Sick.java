package model.bean;

public class Sick {
	private int id;
	private String nameSick;
	public Sick() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sick(int id, String nameSick) {
		super();
		this.id = id;
		this.nameSick = nameSick;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameSick() {
		return nameSick;
	}
	public void setNameSick(String nameSick) {
		this.nameSick = nameSick;
	}
	
}
