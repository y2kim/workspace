package exam;

public class Exam_05 {
	
	public static void duck() {
		int hohoho; // 지역변수 
	}

	public static void main(String[] args) {
		
		
		//변수의 종류 
		//지역 변수  /, 정적변수 /, 멤버변수 /, 매개변수
		//---------지역 변수 ---------------
		//지금 까지 했던 변수는 지역변수 05일 차까지 한것		
		int a  = 10;// 지역변수 {범위지정자} 볌위안에 속해있는 변수  // 자신이 속해있는 지역영역이 끝나면 소멸
	
		{ //하나의 지역 //(가)지역
			int c = 5;  // 메인 지역 변수가 아님 (가)지역 변수
			System.out.println(c);
			System.out.println(a);// 아직 메인지역 안 끝났기때문에 출력가능
			a = 999;
		}
		//System.out.println(c);// (가)지역이 영역이 끝나서 c 변수를 사용못함
		int c = 7;
		System.out.println(c);
		{// 나 지역
			//int a = 54; //a 설명 불가
			int b = 159;  // 메인 지역 변수가 아님 (가)지역 변수
			System.out.println(b);
			System.out.println(a); // 같이 공유
			System.out.println(c);
		}
		//b 출력불가
		
		
		if(true) {
			int iu = 5;
		}
		 iu= 20;
		 
		 while(true) {
			 int po =30 ;
		 }
		
		 po =50;
		 duck();
		//---------------------------------
	}

}
