package exam;

import java.util.Scanner;

public class Exam01_01 {
	
	public static int plus(int num1, int num2) {  
		int result = num1 + num2;  
		return result;// 어떤 결과가 나오면 보고 해야함    
	}
	
	public static int mul(int num1, int num2) {  
		int result = num1 * num2;  
		return result;// 자신을 부른 자리에 같다놓음
	}
	
	public static int subtract(int num1, int num2) {  
		int result = num1 - num2;  
		return result;// 
		// return num1-num2  // 이렇게 리턴해도 됨
	}
	
	public static double division(int num1, int num2) {  
		double result = (double)num1/num2;  
		return result;//     
	}
	
	public static int remainder(int num1, int num2) {  
		int result = num1 % num2;  
		return result;// 
	}
	
	
	public static void main(String[] args) { // main은 스트링형 배열 받음   
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(plus(10,5));
		// plus 만나면 위로 올라가고 반환되어 다시 내려옴 
		System.out.println(mul(10,5));
		System.out.println(subtract(10,5));
		System.out.println(division(10,3));
		System.out.println(remainder(10,3));
		
		//int ie =Integer.parseInt(sc.nextLine());
		//System.in.read();// 인수 char 매게변수   // return int 반환
		String aa = "hello";
		aa.length(); // 인수 넘기지 않음  
		System.out.println(aa.length());
		aa.charAt(2); //char 반환
		System.out.println(aa.charAt(0));
		System.out.println(aa.startsWith("ABC"));
		//startWith 이것과 시작한다  (우리가 사용하는 값) 
		// 스트링값이 시작과 같이 하는가
	}
	/*
	//argument: 아규먼트 인수 받아줌 
	//void : 반환하지 않겠음 
	//main : 
	// parseInt(문자열); : 이녀석도 메소드 매게변수형   : 인수 1개 타입은 String  // return 값은 int 형
	 * 
	//Math.random();  double random()
	 * 매개변수가 없음   Double 형 
	 * return 값도 Double
	// ()소괄호는 무조건 메소드
	 * *
	 * 인수값을 확인
	 * sc.nextLine()  : 매개변수 텅빔
	 * String nextLine()
	 * 표준 메서드 Standad metode 
	 */
}
