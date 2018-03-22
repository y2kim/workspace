package exam;

import java.util.ArrayList;

public class Exam_01 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();  // 대신 다형성을 잃어버린다 . // 용어 외우기 ... // 편리를 얻음   -> 다형성 버려도 된다 YES 
		//<자료형>  <- 제너릭 사용법 
		// 오브젝트가 아닌 입력한 자료형으로 바뀐다.
		// 우측에 <> 생략해도 자동으로 넣어준다  <-  제네릭은 1.5ver 추가됨  // 기업마다 다른 케이스가 있으니 유의할것 
		arr.add("");
		arr.add("Hello");
		arr.add("world");
		System.out.println(arr.get(1).length());
		
	}
}
