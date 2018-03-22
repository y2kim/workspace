package exam;

public class Best {
	private Student bestStudent;
	private Student[] bestStudent2;
	
	public Best(Student bestStudent) {
		this.bestStudent = bestStudent;
	}
	
	public Best() { //메소드는 힙에 저장되는 인스터스에 저장되는건 아니다.
		this.bestStudent2 = new Student[3]; // 무조건 인스턴스가 생성되는건 아니다  // 배열은 다르다
	}
	
	public void addStrudent(Student std) {
		this.bestStudent2[0] =std;
	}

	public Student getBestStudent() {
		return bestStudent;
	}

	public void setBestStudent(Student bestStudent) {
		this.bestStudent = bestStudent;
	}
	
	
}
