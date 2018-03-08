package quiz;

import java.util.Scanner;

public class Quiz_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int bestscore = 100;
		int countnum = 1;
		int win =0;
		int lose =0;
		int turn =0;
		int AI =100;
		int AI2 =1 ;
		int result;
		int brokens =0 ;
		
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
				
				//turn =1;
				while(true) {
					if(turn ==0) {
						System.out.print("내가 넣은 숫자 : ");
						int findnum = Integer.parseInt(sc.nextLine());
						result = findnum;
						if(findnum == rannum) {
							System.out.println("<<< 정   답  >>> ");
							win = win +1;
							System.out.println("당신의 승리!!!!!.");
							AI = 100;
							AI2 = 1 ;
							break;
						}else if (findnum < rannum) {
							System.out.println("<<< U   P  >>> ");
							System.out.println("컴퓨터 차례 입니다.");
							if(result > AI2) {
								AI2 = result+1;
							}
							turn = 1;
						}else if(findnum>101){
							System.out.println("0~100 사이의 숫자를 입력하시오");
						}else {
							System.out.println("<<< D O W N  >>> ");
							System.out.println("컴퓨터 차례 입니다.");
							if(result < AI) {
								AI = result-1;
							}else if(result>101) {
								AI = 100;
							}
							turn = 1;
						}	
					}else if (turn ==1) {
						int comnum = (int)(Math.random()*(AI-AI2+1)+AI2);
						System.out.println("컴퓨터가 넣은 숫자 : "+comnum);
						if(comnum == rannum) {
							System.out.println("<<< 정   답  >>> ");
							lose = lose +1;
							AI = 100;
							AI2 = 1 ;
							System.out.println("컴퓨터의 승리!!!.");
							break;
						}else if (comnum < rannum) {
							System.out.println("<<< U   P  >>> ");
							turn = 0;
							System.out.println("당신 차례 입니다.");	
							if(comnum > AI2) {
								AI2 = comnum+1;
								//broken = 1;
							}else if(comnum == AI2) {
								AI2 = comnum+1;
							}
						}else{
							System.out.println("<<< D O W N  >>> ");
							turn = 0;
							System.out.println("당신 차례 입니다.");	
							if(comnum < AI) {
								AI = comnum-1;
							}else if(comnum>101) {
								AI = 100;
							}else if(comnum == AI) {
								AI = comnum-1;
							}
						}
					}

				}
				turn = 0;
				break;
			case 2:
				// System.out.println("미구현된 기능");
				System.out.println("지금 까지의 기록은 "+win+" 승 "+lose+" 패 입니다.");
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
