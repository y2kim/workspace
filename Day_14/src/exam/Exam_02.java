package exam;



public class Exam_02 {
	
	public static void main(String[] args) {
		int id = 1001;
		String name = "jack";
		int score =80;
		
		Student std ; //stuendt 타입
		Student std1 = new Student(id, name, score);  // 이 방식으로는 for문처리로 하기 힘들다.
		Student std2 = new Student(1002,"Mike",90);
		//Student std3 = new Student(1003,"Susan",100);
		Best best = new Best(new Student(1003, "Susan", 100));
//		Student tok = best.getBestStudent();
//		System.out.println(tok.getName());
		System.out.println(best.getBestStudent().getName()); // 주소.주소.값
		
		Student[] stds = new Student[3];
		stds[0] = std1;
		stds[1] = std2;
		//stds[2] = std3;
		
		if(stds[1].getName().equals("Susan")) {
			
		}
		//System.out.println(stds[2].getName());
//		if(std3.getName().equals("Susan")) {
//			배열은 배열이다
//		}
		//System.out.println(std3.getName());
	}

}
