package introducktion;

public class Exam_01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("HELLO");  // 정지버튼이 잠깐 켜졌다 꺼짐 
		//-----------------------------------------------
		 //System.in.read(); // 프로그램이 명령수행하지 않았기 때문에 정지 버튼이 켜져있음 // 아무리 많이 입력해도 한글자만 읽음  // 엔터 선택후 빨간불이 꺼짐
		 // 허공에 버려짐 
		 System.out.print("한글자로 입력 하세요 : "); 
		 // 나중에 입력 받은걸 출력 할수 있게 여러가지 동작을 실행을 유도할수 있다. // CPU 처리  // 받으려면 대입
		 int a = System.in.read(); // 아직 값이 정해지지 않음 // 먼저 버퍼를 찾음  - 버퍼에 값을 먼저 집어넣음  // A 를 엔터를 치는 순간 둘다 입력함  
		 // 엔터 : \r\n(2글자)  // 사실상 3글자를 입력하게됨 
		 // 
		 // 엔터 이후  값이  ↑에다가 집어넣음  ex : a 엔터 이후 변수에 'a'이 저장됨 // int 형으로 저장
		 System.out.println("입력하신 글자의 ASCII 코드는 : "+ a +" 입니다."); // 변환
		 //-------------------------------
		 //  System.in.read(); 2번 쓰는경우 기억할것 
		 
		 
		 System.out.print("한글자로 입력 하세요 : ");
		 int b = System.in.read(); // 아직 값이 정해지지 않음   //a = System.in.read() : a 재활용 하는게 컴퓨터에게는 이득
		 // 버퍼를 다시 찾아가면 값이 있는 상태여서  \r(캐리즈 리턴) 값을 받아감  // \n (라인피드)
		 System.out.println("입력하신 글자의 ASCII 코드는 : "+ b +" 입니다."); // 변환
		 // 결과값이 에러남   2번째 입력을 못하며 이상한 결과가 나옴
		 // 
		 
		 System.out.print("한글자로 입력 하세요 : ");
		 int c = System.in.read(); // 
		 // \n (라인피드) 값이 출력됨
		 System.out.println("입력하신 글자의 ASCII 코드는 : "+ c +" 입니다."); // 변환
		 
		 System.out.print("한글자로 입력 하세요 : ");
		 int d = System.in.read(); // 자바,C ,파이썬 에도 있으므로  윈도우 쓰는 이상 버퍽를 벗어날수 없음 // 버퍼를 비워저야 함 
		 // 버퍼가 비었으므로 값을 다시 값을 잘 받을수 있음  // AB 치면 65 66 13 10 이렇게 나옴
		 //System.in.read();  한 글자씩 읽으므로 차례로 나오는대로 읽는다  엔터가 값이 2개 이므로   13 10 이 붙는다
		 System.out.println("입력하신 글자의 ASCII 코드는 : "+ d +" 입니다."); // 변환
		 
	}

}
