package exam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exam_05 {
	public static void main(String[] args) {
		//list는 중복을 허용하며 순서를 지킨다.
		Set<String> data = new HashSet(); // 해쉬 알고리즘    // 비번 
		Set<String> data2 = new HashSet(); // <- 방대한 데이터를 검색 
		//set 은 순서대로 넣지않고 뒤죽반복 이고 중복허용하지 않음 
		data.add("Hello"); // 해쉬 알고리즘을 이용하여 값을 측정함 
		data.add("World");
		data.add("Good");
		data.add("Java");
		data.add("New");
		// 중복방지 용도로 사용할수 있다.
		System.out.println(data); // 번호 없음 
		// 돌려야함 Get 사용불 // 기존에 들어온 애들을 빼버린다.
		for(String tmp : data) {
			System.out.println(tmp);
		}
	}
}
