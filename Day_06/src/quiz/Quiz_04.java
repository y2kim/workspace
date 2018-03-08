package quiz;

import java.util.Scanner;

public class Quiz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int bestscore = 100;
		int countnum = 1 ;
		//int risenum = 1 ;
		while(true) {	
			System.out.println("== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. Game End");
			System.out.println("메뉴를 선택하세요 > ");
			int selectMenu = Integer.parseInt(sc.nextLine());
			switch (selectMenu) {
			case 1:
				int rannum = (int)(Math.random()*100+1);				
				System.out.println("<<< Game Start >>> ");
				while(true) {
					System.out.print("Input Number : ");
					int findnum = Integer.parseInt(sc.nextLine());
					if(findnum == rannum) {
						System.out.println("<<< 정   답  >>> ");
						break;
					}else if (findnum < rannum) {
						System.out.println("<<< U   P  >>> ");
						countnum++ ;
					}else if(findnum>101){
						System.out.println("0~100 사이의 숫자를 입력하시오");
					}else {
						System.out.println("<<< D O W N  >>> ");
						countnum++ ;
					}	
					//countnum = risenum;
				}
				if(bestscore > countnum) {
				bestscore = countnum;
				}
				countnum =1;
				//risenum = 1;
				break;
			case 2:
				// System.out.println("미구현된 기능");
				System.out.println("지금 까지의 최고 기록은 "+bestscore+"회 입니다.");
				break;
			case 3:
				System.out.println(" 게임을 종료합니다. ");
				System.exit(0);
				break;
			default :
				System.out.println(" 메뉴를 다시 확인해주세요 ");
				break;
			}
		}
	}
}
