package introducktion;

import java.util.Scanner; // 스캐너 사용 선언 //자동 Import //ctrl+shift+o (이클립스 만의 인공지능)

public class Exam_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력 도구중 하나 , 가장 간단하게 쓰이		
		//
		System.out.print("메세지를 입력하세요 : ");
		String msg = sc.nextLine(); // 버퍼로 부터 한 줄을 가져옴  \r\n 까지 다 가져옴 :: 버퍼 내용 다 가져옴  :: String 형 변수
		//parse : 분석하다
		
		// int num = Integer.parseInt(msg);// 괄호한의 문자열을 숫자로 분석해라.  int형 변수로 값 집어넣음
		
		//-------=---
		//String msg = sc.nextLine(); 생략  ↓
		
		int num = Integer.parseInt(sc.nextLine()); // String msg 변수를 빼서 한줄로 축약 (앞으로 많이 쓰임)
		
		//sys에 값 바로 입력
		//System.out.println(Integer.parseInt(sc.nextLine()))  // 값 너어서 바로 계산도 가능하게
		//-------------------------------
		System.out.println(num + 10); // 버퍼를 다 가져가므로  안심
		
		
		
	}

}
