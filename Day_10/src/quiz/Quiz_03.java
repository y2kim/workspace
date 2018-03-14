package quiz;

import java.util.Scanner;

public class Quiz_03 {
	
	public static int[] func3(char ch) {
		return new int[] {1,2,3}; // new 힙 메모리를 만들겠다 , 3개짜리 
	}
	
	public static char func2(int num) { //16줄이 실행 되서 이쪽으로
		return 'A';// 다시 16줄로
	}
	
	public static int func1(String str) { // 29 줄의 호출후 이쪽으로
		return func2(10); // 11줄 (리턴 값이 char 'A') 그리고 29줄로
	}
	
	public static String func4() { // 29 줄의 호출후 이쪽으로
		return "Hello";
	}
	
	public static String func5() { // 29 줄의 호출후 이쪽으로
		return "Apple:Orange";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		Scanner sc = new Scanner(System.in);
		str.contains("");
		str.charAt(0);
		str.indexOf(1);
		byte[] bb = str.getBytes(); // 반환 시키는 값에  반환되는 변수 선언 대응해야함
		//str.indexOf(String.valueOf(Integer.parseInt(sc.nextLine())));
		// 펑션1 자리로 감  
		func1("Hello");// 15줄로 결국 int 형으로 돌아감
		// 65 임 
		//func2("Hello");//메소드가 인트형으로 받아야 하는데 스트링이 와서 // 숫자 아무거나//char형으로 들어옴 
		//func3(65);//char 형인데 int형으로 받으려고 해서 //char 하나형 // 이론상 int 배열 형으로 들어옴
		int num1 = func3('C')[0]; // 반환 값을 천자를 읽음 1 들음
		String str2 = func4().substring(3);// 스트링을 반환 // 리턴값이 무었인가 먼저 생각함
		System.out.println(str2);
		char ex= func5().split(":")[1].toCharArray()[1];//Array[임의의 숫자]  가 되면 배열이 아닌 개인 값이 된다.
		String ex2= String.valueOf(func5().split(":")[1].toCharArray()[1]);// String.valueOf 붙이면 String 형이 된다 .
		char[] ex3= new char[] {};
		for(int i=0;i<ex3.length;i++) {
			ex3[i] = func5().split(":")[i].toCharArray()[i];
			System.out.println(ex3[i]);
		} // 배열 저장시  하나하나를 자료를 볼줄 알아야함 
		System.out.println(func5().split("O")[0].toCharArray()[func5().substring(2).split("r")[0].length()]); // 배열을 0부터 시작해서 자꾸 갯수 -1 하는 실수 함 배열갯수 착각하지 말것
		
		
		
	}

}
