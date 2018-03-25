package exam;

import java.util.ArrayList;

import study.Student;
import study.StudentManage;

class A {
	
}

class B{
	
}

public class HellOfHell { //<- 클래스 중괄호
	int c; // <- 멤버변수  인스턴스가 지워질때  사라짐   , 쉽게 메모리에서  안사라짐 
	//coape 스코프 - 중괄호 - 영역  <-  
	// 객체 지향의 중심은 class    ,  new 
	//class <- 설계도 
	//실제로 만들어진 대상 <-인스턴스 
	public void func() {
		int a = 10;
		ArrayList arr = new ArrayList(); //자료형 변수명
		arr.add("Hello");
	}
	
	public void func2() {
		System.out.println();
		func();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = new int 10;
		
		A a = new A();  //  두개의 인스턴스 주소가 다르다 
		B b = new B();  //
		System.out.println(a.equals(b));
		
		
		
	}
	

	

}
