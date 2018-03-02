
public class Exam01 {

	public static void main(String[] args) {
		// 정수
		byte a = 127 ; // 코드의 순서 있음 
		
		byte b ; // 1BYTE 라는 크기의 b 의 변수 선언
		b = -128 ; // b 의 값 설정
		
		short c ;
		c = 32767;
		// c = 32768;
		
		char d ;
		d = '뚫'; // unicode 실제로는 숫자
		char d1 ;
		d1 = 'A'; // ASCII = 65
		// char d2 ;
		//d2 = "A"; // ASCII = 65가 아니게 됨   
		char d3 ;
		d3 = 65 ; // ASCII = 65 인 A 가 출력
		
		int e = 1000000000 ; // 
		long f = 100000000000000L; //이클립스 문법검사의 한계   뒤에 L를 붙이면 됨
		// 실수
		float g = 3.14F ;//얼마나 정밀하게 소숫점 표현  이클립스의 문법검사의 한계 /F 붙이면 됨
		double h = 5.12 ;// 기본 실수는 더블로 인식
		
		boolean tf = true ; // true / false 둘중 하나밖에 안됨  논리형 (비교 불가)
		
		String i = "Hello" ; // 문자열  대소 관계 중 모든 자료중에서 제일 큼 (Booleans 포함)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d3);
		System.out.println(tf);
		
		
		
	}

}
