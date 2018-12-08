package model.bean;

public class Answer {
	private int id;
	private String suggestion;
	private int ability;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int id, String suggestion, int ability) {
		super();
		this.id = id;
		this.suggestion = suggestion;
		this.ability = ability;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public int getAbility() {
		return ability;
	}
	public void setAbility(int ability) {
		this.ability = ability;
	}
	
}
