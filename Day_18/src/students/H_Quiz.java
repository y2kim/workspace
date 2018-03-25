package students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class H_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Map<Integer, List<Student>>> data = new ArrayList<>();
		  Map<Integer, List<Student>> map = new HashMap<>();
		  List<Student> students = new ArrayList<>();
		  students.add(new Student(1005,"Jack",30,50,90));
		  students.add(new Student(1001,"Jane",10,20,50));
		  map.put(3, students);
		  data.add(map);

		  // Jane의 학번 출력
		  System.out.println(data.get(0).get(3).get(1).getStuID());
		  
	}

}
