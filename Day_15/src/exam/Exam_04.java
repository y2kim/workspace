package exam;
import java.util.ArrayList;
// 벡터 = arrayList 연습 동적  [쓰레드 차이]
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
//[헬로우 주소][][][][][][][][][]
public class Exam_04 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList(); //default 10
		arr.add("Hello"); //array 는 기본적으로 빈칸을 허용하지 않는다,
		arr.add("World"); //10개 넘어가도  에러 안남 
		arr.add("Java");
		arr.add(2,"Good");//<- 오버라이딩 된 놈 
		arr.remove(0);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}

		//arr.addAll(arr);
	}
}
