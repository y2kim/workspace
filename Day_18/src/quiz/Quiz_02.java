package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import students.Student;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stds = new ArrayList<>();
		stds.add(new Student(1001, "Jack", 10, 20, 30));
		stds.add(new Student(1002, "Mice", 50, 30, 30));
		Map<Integer,List<Student>> map = new HashMap<>(); // 마으크의 국어 점수 출력 
		map.put(1, stds); // 리스트로 하면 여러개 출력가능하다 
		//map.put(2, stds);
		// map.get(1) 리스트
		System.out.println(map.get(1).get(0).getKorSco());
//		for(Student std : map.get(1)) {
//			if(std) {
//				
//			}
//		}
		
		
	}

}
