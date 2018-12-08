package model.bean;

public class Doctors {
	private int id;
	private String name;
	private String department;
	private String picture;
	
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctors(int id, String name, String department, String picture) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.picture = picture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	
}
