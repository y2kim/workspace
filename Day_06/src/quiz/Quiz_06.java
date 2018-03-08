package quiz;

import java.util.Scanner;

public class Quiz_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int MAXNUM = 31 ;
		final int MINNUM = 1 ;
		int win =0;
		int lose =0;
		int turn =0;

		while(true) {
			System.out.println("== Baskin Robbin 31 Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. Game End");
			System.out.println("메뉴를 선택하세요 > ");
			int countnum =1 ;
			int selectMenu = Integer.parseInt(sc.nextLine());
			switch (selectMenu) {
			case 1:
				System.out.println("<< Game Start  >>");
				turn =0;
				while(true) {
					if(turn ==0){
						System.out.print("1회 에서 3회까지중 정해주세요. :");
						int myCnt = Integer.parseInt(sc.nextLine());
						if(countnum==MAXNUM) {
							System.out.println("31 당첨 아이스크림 쏘기 YOU LOSE");
							lose = lose +1;
							break;
						}
						if( 1<=myCnt && myCnt<=3 ) {							
							for(int i=1 ; i<=myCnt ;i++) {	
//								if(countnum==MAXNUM) {
//									System.out.println("31 당첨 아이스크림 쏘기 YOU LOSE");
//									lose = lose +1;
//								}
								System.out.println(countnum+" !");
								countnum=countnum+1;											
							}
						}else if(myCnt>=0 &&4<=myCnt) {
							System.out.println("1~3 사이 숫자를 집어넣어주세요");
						}	
						turn =1;
					}else if(turn ==1){
						System.out.println("1회 에서 3회까지중 정해주세요.(컴퓨터):");
						int comnum = (int)(Math.random()*3+1);
						if(countnum==MAXNUM) {
							System.out.println("31 당첨 아이스크림 쏘기 YOU WIN");
							win = win +1;
							break;
						}
						for(int i=1 ; i<=comnum ;i++) {		
//							if(countnum==MAXNUM) {
//							
//							}
							System.out.println(countnum+" !");
							countnum=countnum+1;
						}					
						
						turn = 0;
					}

				}
				break;
			case 2:
				System.out.println("<<   당신의 전적      >>");
				System.out.println(" W  I  N : "+win);
				System.out.println(" L O S E : "+lose);
				break;
			case 3:
				System.out.println("<< 게임을 종료합니다. >>");
				System.exit(0);
				break;

			default:
				System.out.println(" 메뉴를 다시 확인해주세요 ");
				break;
			}
		}

	}

}
