package exam;

import java.util.Scanner;

public class Exam_07 {
	
	public static void Shop(int gold/*인수 받아야 함  // 근데 여기서 문제가 생김  매개변수 에서 골드가 깎임  그대로 1000*/) {
		// 포션도 샀는데 안 삼
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상점임");
		System.out.println("메뉴");
		/*
		 * 생략
		 * 	// 입력
		 * 골드  , 정보들 ... 전부 사라지면 안되니 
		 * 프로그램 정보는 메인에 생성 
		 * 
		 * 값 혼동도 생길수 있음 
		 * 
		 * 주소를 통해서 값을 건들수 있음 
		 * */

		// 그래서 리턴 값을 받아서 돌려줌   
		// 리턴 하면 메소드 끝남 
		/* 하나 사고 쫒겨 나가고 이러는 경우가 발생함 */
	}
	
	public static void main(String[] args) {
		// 메인은 끝날때 까지 가지고 있으니  중요한 프로글매 정보는 여기다가
		/*
		 * int 형일 경우  shop 에서 사용못함  지역변수라 
		 * 
		 * 샵에서도 알아야 하기 때문에 
		 * 
		 * 인수값을 골드로 넘겨줌
		 * */
		Scanner sc = new Scanner(System.in);
		// 머드 게임
		System.out.println("바람의 나라 접석");
		System.out.println("어디?");
		System.out.println("1,2,3,4,5");
		// 입력
		/*
		상점 메소드 따로
		*/
		int i=1;
		switch (i) {
		case 1:
			// gold -shop(gold)
			/*
			 * 이렇게 하면 복잡함
			 * */
			break;

		default:
			break;
		}
		
		
	}

}
