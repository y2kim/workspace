package exam;  // protected는 상속 진행할때 설명
// static
public class Exam_01 { // 이 클래스는 프로그램 시작점 
	public static void main(String[] args) {
		
		Temp t = new Temp(); // 인스턴스 생성 
		t.a =10 ; // 애초에 퍼블릭이였으니 겟터 셋터 필요 없음
		/**/
		Temp t2 = new Temp(); // 인스턴스2 생성 
		t2.a =10 ; // 또 다른
		/*
		 * [t1(1000)     t2(2000)]
		 * -
		 * [t1[1000인스턴스{}]		t2[2000인스턴스{}]	]
		 * */
	}
}
