package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_05 extends Object{ //묵시적 코드 extend object 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList Ethe = new ArrayList();  //<- 서로다른 자료형이 들어감
		Ethe.add("f");// 공통점 : 객체, 인스턴스  , 어떤 자료형을 상속을 받고있다
		Ethe.add(1, 95); // 기본 자료형이여서 박싱
		Ethe.add(2,"Van"); // 스트링형은 박싱 언박싱이 안일어남 
		Ethe.add(0,"dark"); // 어레이 사용자가 뭘 넣을지 모르니까
		Ethe.add(3,"c"); //Object : 객체 
		Ethe.add("home"); // 다운 캐스팅  오브젝트에서 꺼내면 오브젝트 
		Ethe.add(5,45.04);
		Ethe.add("Collector");
		Ethe.add(6,"ass");
		Ethe.add(2,"Big");
		Ethe.add(4,"Boy");
		Ethe.set(4, "k");  // 아주 불편한 놈 
		//Object : 클래스의 최고 조상 , 다형성의 꼭대기 
		Object/*<- 주소를 저장하는놈 */ o = 10.99; // 이런방식으로 사용하면 절대 안됨
		//박싱-> Object o(인스턴스 주소를 저장) = new Integer(10); 참조자료형  //<- 이클립스의 판단
		// 인스턴스로 둘러 쌈 
		System.out.println(o);  // 원래는 주소값이 나와야 함 
		//System.out.println(((String)Ethe.get(1)).length()); -- 불편
		//10 이 나오는걸 언박싱   기본자료형만 발생함
		for(int i=0;i<Ethe.size();i++) {
			System.out.println(Ethe.get(i));
		}
		Ethe.remove(6);
		Ethe.remove(0);
		Ethe.set(7, "fantasy");
		System.out.println(Ethe.contains(0)==Ethe.contains(0));
//		for(int i=0;i<Ethe.size();i++) {
//			System.out.println(Ethe.get(i));
//		}
		
	}

}
