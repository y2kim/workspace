package exam;
// 배열 연습 정적
import java.util.Collection;
import java.util.Collections;
//[헬로우 주소][][][][][][][][][]
public class Exam_03 {
	public static void main(String[] args) {
		String[] arr = new String[10];
		arr[0] = "Hello";
		arr[1] = "World";
		arr[2] = "Java";
		// 중간에 값을 넣고 싶을때 복잡해지는게 있다 .
		arr[3] = arr[2];
		arr[2] = "Good";
		
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = arr[3];
		arr[3] = null;
		// 앞에 있는걸 삭제할때의 번거러움
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
