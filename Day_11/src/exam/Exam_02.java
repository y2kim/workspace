package exam;

import java.util.Scanner;

// main 만들 용도  , 프로그램 시작점
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 절차는 세계   설계도
		String a; // 설계도 엄청나게 많이 줌
		Tv lg;  /* 원래는 에러는 나야함    Tv class 가 생성했기 때문   8대 자료형 빼고는 저렇게 만듬    변수만 만듬
		Tv 참조형 자료   데이터는 힙 변수는 스택   실제로 만든게 아님
		*/
		// 대문자로 시작하는 것들은 대부분 클래스 라는뜻
		/*
		 * [[Tv(4Byte)]]  Tv는 실체가 아님 아직
		 * [	]
		 * [	]
		 * [	]
		 * */
		lg =new Tv(); // 힙 메모리 에 Tv형 데이터 생성
		// 1000번지로 가라   표현은 .(객체접근연산자) 이다    //   new Tv() = Tv형 인스턴스
		/* TV lg =new Tv(); : Tv 라는 변수 만들고 인스턴스 연결
		 * [	]
		 * [	]
		 * [-주소-Tv[Brand,Cahnal,Volume{powerOn{},chanalUp()}]] <-실제로는 메소드는 포함되지는 않음  [주소는 있다고 가정하고 사용]
		 * [	]
		 * 
		 * Tv[Brand,Cahnal,Volume{powerOn{},chanalUp()}] <- 객체라고 부름  외국에선 인스턴스(Instance)
		 * */
		//--------
		/*
		 * Tv : 클래스, 참조자료형
		 * lg : 참조변수명
		 * = : 대입연산자
		 * new Tv() : Tv 인스턴스() :::   Tv형 주소를 lg에 대입
		 * 자바는 오픈소스 문화    
		 *   배포할때튼 클래스 , 기계어를 배포, 그안의 소스코드를 못봄
		 *  라이브러리 , 우리꺼 라이선스  라는둥 .   
		 * */
		// 기능목록 보여줌   lg.
		
		Scanner sc  /*<- 인스턴스의 주소알고있음*/= /*-> 인스턴스*/new Scanner(System.in);
		//sc(이녀석은 변수 이름으로 마음대로 바꿔서 사용가능) {<- 인스턴스안의 [변수==필드 , 메소드] 사용가능
		
	}

}
