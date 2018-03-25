package test;

public class People {
	
	private int id;
	private String name;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	
	public People(int id, String name, int birthYear, int birthMonth, int birthDay) {
		super();
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
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
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	
	
	
	//long startTime = System.currentTimeMillis(); 
	
	
	
}
