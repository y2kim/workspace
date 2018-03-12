package exam; // 비유중


public class Exam_01 { // 회사
// 중요도 매우 높음
	// public static  
	
	//num1,num2 : 매게 변수 //plus라는 메소드
	// 리턴 데이터 타입  + 메소드 이름 + 매게변수
	//{실행코드}
	public static int plus(int num1, int num2) {   // 직원 1 명 고용  // plus 메소드  //() <- 값을 받아줘야함 //받을 인수들    왼->오  순서  , 갯수 일치
		int result = num1 + num2;  // 자기 자리가 필요함 : {} 영역표시   
		// result : 지역변수  // result에 보고서 작성
		return result;// 어떤 결과가 나오면 보고 해야함    
		// 변수가 사라질 언정 값을 저장해야함  : return(대상)   
	}
	// 일단 여기까지 핵심 [] 좀 극단적인 예...
	
	public static void main(String[] args) { // 직원 1인기업 //사장// 메소드임
		// TODO Auto-generated method stub
		System.out.println(10 + 5); // 메소드 관점에서는 불편한 코드  : 덧셈은 왜 안 뺐놨냐?(메인이 직접 해서)  // syso 도 출력하는 기능 // 
		// 간단한 기능 조차도 분리
		int a; // 지역변수
		System.out.println(plus(10,5)); //plus 호출  --  (일거리 줘야함)[,로 값 구분 지음]   인수 : 메소드 콜 하며 넘겨주는 값, = 인자값 // 메소드 콜 
		// parameter=,Argument
		/*인수 = 인자 = parameter = argument  
		 * plus 로 넘김
		 * */
	}
	
	
	

}
