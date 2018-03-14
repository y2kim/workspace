package exam;
import java.*;;

public class Exam_04 {
	
	public static void func(int a) {
		System.out.println("int형 매개변수를 가지는 func ");
	}

	public static void func() {
		System.out.println("매개변수 없는 func");
	}
	
	public static void func(int c, int b) {
		System.out.println("2개 매개변수를 가지는 func ");
	}
	
	public static void func(char ch) {
		System.out.println("char형 매개변수를 가지는 func ");
	}
	
	public static int func(String ch) {
		System.out.println("String형 매개변수를 가지며 리턴값 있는 func ");
		return 0;
	}
	
	public static String func(String ch,int a) {
		System.out.println("String형 과 Int 매개변수를 가지고 리턴 하는 func ");
		return null;
	}
	
	
	public static void main(String[] args) {
		//Overload = 과적하다      // 그렇게 중요하지만 이게 무엇인지는 알아야 한다.  // 대채할수 있는 것도 있다. 3~4
		// Override 하고 착각 ㄴㄴ
		// 메소드 오버로딩
		System.out.println();  // int , Stirng  전부 받음 매개변수형이 전부 다름
		/*
		 * 메소드 = 펑션  이름이 겹치는거 허가 안함  : 구분 짓기 위해
		 * 같은 이름에(메소드) 매개변수에 차이를 두자
		 * 이름 하나에 여러게 매개변수를 씀
		 * 타입,갯수에 영향이 기치나  return 은 오버로딩에 영향을 못줌
		 * 
		 * func()  : 인수 값 없이 부름: 콜메서드 : call by name // 이슈 없음
		 * 
		 * func( 기본형 ~~~( int)))  : 값을 이용해서 호출: call by value :값 자체 // 이슈 있음     :자바 에서 설명 하기 힘듬 
		 * 
		 * func(String[값이 아닌 주소],참조형) : 주소에 의하여 호출 : call by reference  // 이슈 있음
		 * 
		 * */
		
		func();
		func(1);
		func(1,2);
		func('a');
		func("do you");
		func("da way", 2);
		//String.valueOf();ㅗㅗ
		"Hello".substring(1, 3); // 이름은 하나인데 매개변수 가 여러개 
	}
}
