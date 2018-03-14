package exam;

public class Exam_04_01 {

	public static void func(int num/* func(a) 에서 a 값을 받아줌 */) {// 둘다 메모리 영역이 나뉘어 져서  겹쳐도 에러 안남
		num/*func 스택에 가지고 있는거 사용 즉 매개변수를 사용  메인지역 아님 */ = 20/* 매개변수에다가 20을 집어넣음*/;
		
		
		// 리턴으로 값을 돌림   -> 메인으로 돌아감
	}// 메소드 끝냄
	/*
	 운영체제가 func 스택에서 사용하던 내용을 지움
	 메인을 안 건듬
	 */
	public static void main(String[] args) {
		// call by value   값만 가지고 놈   (비교대상이 없어서 좀 어렵게 느낌)
		
		int num =10;
		//  text data 아직
		System.out.println(num);
		/*call by value   값만 가지고 놈
		메모리 
		main(시작),func
		[	stack(default)	]   [main(num 10)	] // 메인 스택 생성   //
		[		]				[	]
		[	heap	]			[	]
		[		]				[	]
		
		syso : 메인에 있어서 메인 가지고 실행
		
		메소드 마다 스택이 생성
		
		*/
		func(num); // 스택에 펑션이라는 스택 생성 -> 5번 라인
		// 메소드 끝나고 옴
		/*
		
		[num{지역변수} ]		[func() num{매개변수} 20은 펑션에 들어감]
		[]		[]
		[]		[]
		[]		[]
		값을 복사할 뿐    main를 건들지 않음
		
		펑션이 끝나는 순간 메모리를 지워 버린다 
		*/
		System.out.println(num);
		/*
		메인 지역은 메인 코드 가지고 실행
		[int num]		[]  : 지역변수 호출
		[]		[]
		[]		[]
		[]		[]
		
		
		*/
	}

}
