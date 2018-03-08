package quiz;

import java.util.Scanner;

public class Quiz_02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//double coinnum = Math.random()*2+1 ;  // 한번만 틩김
		
		while(true) {
			System.out.println("=== 동전 앞 뒤 맞추기 ===");
			double coinnum = Math.random()*2+1 ; // 여러번 반복
			System.out.print("숫자를 입력해주세요 (1.앞면/2.뒷면/0.종료) : ");		
			int chonum = Integer.parseInt(sc.nextLine());
			if(chonum ==0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}			
			if(chonum == (int)coinnum) {
				System.out.println("맞췄습니다 ! 맞워여");
				System.out.println("");
				System.out.println("---------------->restat");
			}else if(chonum >= 3 || chonum < 0 ) {
				System.out.println("1,2 만 들어갈수 있습니다 메뉴를 확인해주세요");
			}else {				
				System.out.println("땡! 틀렸습니다");
				System.out.println("");
				System.out.println("---------------->restat");
			}
		}
	}

}
