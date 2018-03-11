package exam;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[b(값),a(주소값)	] : 스택
		//[	]
		//[a([][][][] 연속적)] :힙
		//[	]

		int b;  // 스택 a 저장 (값 정보)
		// b[] 이름 하나당 공간 하나
		int[] a; // int 형 배열  : 스택 a 저장 (주소 정보)   형태가 바뀜 // 배열의 주소를 저장할 변수 생성

		a = new int[4]; // 힙   // 1000값 을 a 를 저장
		//각각의 칸 부르려면 번호 이용
		//a [][][][] 4칸 저장
		//a [0 번째 칸][1 번째 칸][2 번째 칸][3 번째 칸] 4칸 저장 // 자동으로 할당
		a[0] = 10 ;
		a[2] = 20 ;
		a[1] = 15 ;
		a[3] = 25 ;
		//a[4] = 30 ; // 문법검사기가 잡아내지 못하고  실행후에 에러가 나오는 경우
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4   경계 밖으로 나왔다  - 숫자 4때문에
		// 자동할당으로 부르는 번호 이름명칭 : 인덱스  , 배열의 천자    // 시작은 0부터
		/*
		 * 그래서  마지막은 n-1 인덱스임  
		 * 의미  : offset
		 * offset : 기준점에서 얼마만큼 떨어져 있는가
		 *  n번지의 a 배열  몇번만큼 떨어져 있는지 
		 * [int 형일때] 1 칸당 4byte 만큼 떨어짐 0칸[기준점] 1000번지  1칸 1004 번지  2칸 1008번지 3칸[마지막] 1012번지
		 * */
		int c=1;
		//스캐너 가능 System.out.println(a[숫자가 올수 있으면 됨]);
		System.out.println(a[0]);
		System.out.println(a[1-1]);
		System.out.println(a[1]);
		System.out.println(a[c]);
		System.out.println(a[2]);
		System.out.println(a[1]);
		System.out.println(a[3]);
		//a.length : 몇칸인지 알수있음   크기 
		System.out.println(a.length);
		
	}

}
