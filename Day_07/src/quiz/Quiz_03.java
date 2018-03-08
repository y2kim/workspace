package quiz;

import java.util.Scanner;
//choice
public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int myMoney =1000;
		int firstmoney = 1000;
		while(true) {
			System.out.println("==경마 게임=== ");
			System.out.println("1. Game Start");
			System.out.println("2. My Assets");
			System.out.println("3. Game End");
			System.out.print("메뉴를 선택하세요 > ");
			int selectMenu = Integer.parseInt(sc.nextLine());
			switch (selectMenu) {
			case 1:
				int runhorse = (int)(Math.random()*3+1);
				System.out.println("몇 번 말에 베팅하시겠습니까? <1위 에게만 50% 이익> ");
				System.out.println("1. 나이가 많지만 1위 기록이 많은 말");
				System.out.println("2. 덩치가 크고 힘이 세보이는 말");
				System.out.println("3. 덩치가 작고 날렵해 보이는 말");
				System.out.println(runhorse);
				System.out.print("선택 : ");
				int horse = Integer.parseInt(sc.nextLine());
				if(0<horse&&horse<4) {
					System.out.print("베팅할 금액을 입력하세요 (현재 보유 - "+myMoney+") : ");
					int liskMoney = Integer.parseInt(sc.nextLine());
					if(myMoney>=liskMoney&&liskMoney>0) {
						System.out.println("=====경기를 시작 합니다=====");
						System.out.println(runhorse+" 번 말이 승리하였습니다.");
						if(horse==runhorse) {
							System.out.println("축하합니다. 당신이 베팅이 성공했어요!");
							myMoney = myMoney+(liskMoney/2);
							System.out.println("현재 보유한 금액 : "+myMoney);
						}else {
							System.out.println("아쉽지만 이번엔 당신이 잃었네요");
							myMoney = myMoney-liskMoney;
							System.out.println("현재 보유한 금액 : "+myMoney);
							if(myMoney==0) {
								System.out.println("도박은 모든 걸 앗아갑니다. 이제 하지마세요");
								System.out.println("<<Game Over>>");
								System.exit(0);
							}
						}
					}else if(1>liskMoney) {
						System.out.println("음수는 입력할수 없습니다.");
					}else {
						System.out.println("잔액이 부족합니다.");
					}
				}else {
					System.out.println("말은 1,2,3 번 밖에 없습니다.");
				}
				break;
			case 2:
				System.out.println("현재 보유한 금액 : "+myMoney);
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("메뉴를 다시 확인해주세요");
				break;
			}
		}
	}

}
