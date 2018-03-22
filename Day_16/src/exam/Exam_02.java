package exam;

import java.util.ArrayList;
// 또 다른형태의 
// for 문 
public class Exam_02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Hello");
		arr.add("World");
		arr.add("GoodDay");
		arr.add("toJava");
		
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
		
		for(String tmp :arr) { //<- for each     : 이터레이팅 for    단점은 무조건 다 돌아야한다는점 , 즉 갯수 통제 X 
			//(받을자료형 변수:컬랙션)     컬랙션 : 변수의 집합들
			//  :  <- 왼쪽으로 집어 던진다.
			System.out.println(tmp);   // 값이 더이상 없으면 포문 끝남
		}// 코드가 간결 해진다  , get 할 필요없다     
		
	}
}
