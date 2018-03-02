package KH_quiz;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 =10;
		int i2 =20;
		float f1 = 3.14f;
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println("결과 :" + i1 + i2);  // 앞부터 계산되어서 문자로 인식   ""=문자열 연결 
		System.out.println("결과 :" + (i1 + i2)); // 괄호 먼저 계산되어 숫자로 인식함
		
		System.out.println("결과 :" + i1 + f1);
		System.out.println("결과 :" + (i1 + f1));
		
		System.out.println("결과 :" + f1 + c1);// 앞에 문자열이기 때문에 연결되어서 문자열로  출력 
		System.out.println("결과 :" + (f1 + c1));// 앞의 계산하기 때문에 수치값으로 인식되어 계산먼저 시작 (3.14 + 65.0)
		
		System.out.println("결과 :" + c1 + c2); // "" 연결됨   
		System.out.println("결과 :" + (c1 + c2)); // String , Char 다른것 65+66
		// 앞의 자료형을 붙으면 선언이 됨(선언) int i =1
		//  자료형이 없으면 변수를 쓰겠다는뜻 (사용) i = 1  // 스택
		System.out.println(5/2);
		System.out.println(5%2);
		
		
		
		int a = 10;
		int b = 20;
		System.out.println("변수 a의 값은 "+a+" 이고 b의 값은 "+b+" 이다."); //"Literal 상수"
		a = 170;
		b = -99;
		System.out.println("근데 알고보니 변수 a의 값은 "+a+" 이고 b의 값은 M"+b+" 이다."+"합은"+(a+b));
		
	}
}
