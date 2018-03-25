package exam;

import java.util.ArrayList;
import java.util.LinkedList;


//arraylist 비순차적 삭제에서 비효율적  퍼포먼스가 떨어짐  
//linkedlist: 따로따로 만듬 
public class Exam_03 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); //  int는 참조변수에서 쓸수가 없어서 integer 써야함 
		LinkedList<Integer> Elist = new LinkedList<>();
		for(int i=0; i < 1000000;i++) {
			Elist.add(i);
		}
		long startTime = System.currentTimeMillis(); // 1970 부터 지금까지 흐른시간을 초로 표현 
		//System.out.println(startTime);
		// LinkedList 지운다고 땡기지 않고 주소만 바꿔줌
		for(int i=0; i < 500;i++) {
			Elist.remove(200);  //대략  1000000*500 지우는 시간이 됨  왜냐 땡겨오느냐
		}
		// 하나를 지우고 땡기고 하느랴 시간이 걸림 ArrayList는
		// 시간이 별로 안걸린다 
		long endTime = System.currentTimeMillis(); // 시간기록할때 이거 사용함 
		System.out.println(startTime +" : "+ endTime);
		System.out.println(endTime - startTime);
	}
}
