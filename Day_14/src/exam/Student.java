package exam;

class Student{  // 이런걸 할때는 바깥에다가 하나 만드는게 좋다  // 설계도
	private int id;
	private String name;
	private int score;
	
	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}