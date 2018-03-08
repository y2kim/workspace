package quiz;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		while(true) {
		System.out.println("==주사위의 가지의수=== ");
		System.out.println("2~12의 사이의 수를 넣으세요 0은 종료");
		int caseint = Integer.parseInt(sc.nextLine());
		//int dice1 = (int)(Math.random()*6+1);
		//int dice2 = (int)(Math.random()*6+1);
		
		if(caseint==0) {
			System.out.println("프로그램 종료합니다.");
			System.exit(0);
		}else if(1<caseint&&caseint<13) {
			System.out.println(caseint+" 가 나올 가지의 경우는");
			for(int dice1 =1; dice1<=6; dice1++) {
				for(int dice2 =1; dice2<=6; dice2++) {
					if((dice1+dice2)==caseint) {
						System.out.println(dice1+" + "+dice2+" = " + caseint);
					}
				}
			}
			System.out.println("경우입니다.");
		}else {
			System.out.println("주사위 2개로 나올수 없는 값입니다.");
		}
		
		}
	}

}
