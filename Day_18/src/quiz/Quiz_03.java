package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import students.Student;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Map<String, List<Student>>> data = new ArrayList<>();
		Map<String, List<Student>> map = new HashMap<>();
		List<Student> studnts = new ArrayList<>();
		studnts.add(new Student(1005, "NULL", 30, 50, 90));
		map.put("1반", studnts);
		data.add(map);
		
		System.out.println(data.
				get(0).
				get("1반").
				get(0).
				Total());
		
	}

}
