package exam;
// b 는 static int b 였음
public class Exam_01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* b- 클래스 멤버 필드 
		 * [t1[] t2[]] - stack
		 * [b] -data  - t1,t2의 공유되는 변수  <- 인스턴스 안만들고 이미 자체 생성  
		 * [(t1[b[]])(t2[b[]])] - heap     // 인스턴스는 스택틱b 주소를 가지고 있다   
		 * [] 
		 * */
		
		Temp.b = 20;  // 인스턴스 만들필요 없이 바로 생성   메인이 실행되면 언제든 값을 넣을수 있다.
		//static 은 C 언어의 전역변수 같은 개념 
		//
	}

}
