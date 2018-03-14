package exam;

import java.util.Scanner;

// 메소드의 과거는 function 최소한의 기능
public class Exercise_01 {

	public static int makeRandom(int num1, int num2) {
		return (int)(Math.random()*(num1-num2+1)+num2);
	}
	
	public static void Respon(int whatCase) {
		int choise = whatCase;
		switch (choise) {
		case 1:
			System.out.println("<<< U   P  >>> ");
			System.out.println("컴퓨터 차례 입니다.");
			break;
		case 2:
			System.out.println("<<< D O W N  >>> ");
			System.out.println("컴퓨터 차례 입니다.");
			break;
		case 3:
			System.out.println("<<< U   P  >>> ");
			System.out.println("당신 차례 입니다.");
			break;
		case 4:
			System.out.println("<<< D O W N  >>> ");
			System.out.println("당신 차례 입니다.");
			break;	
		}
	}

	public static void printMenu() {
		System.out.println("== Up & Down Game ==");
		System.out.println("1. Game Start");
		System.out.println("2. Game Score");
		System.out.println("3. Game End");
	}

	public static void systemExit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

	public static void ShowScore(int win, int lose , int bestscore) {
		System.out.println("지금 까지의 빨리 맞춘 기록은 "+bestscore+" 회 입니다.");
		System.out.println("지금 까지의 기록은 "+win+" 승 "+lose+" 패 입니다.");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int countnum; // (횟수)점수 카운트
		int bestscore = 100; // 최고점수
		int win =0; // 승리횟수
		int lose =0; // 패배횟수
		int turn =0; // 턴 횟수
		int comMax;
		int comMin;
		int result;



		while(true) {
			printMenu();
			System.out.print("메뉴를 선택하세요 > ");
			int selectMenu = Integer.parseInt(sc.nextLine());
			switch(selectMenu) {
			case 1:
				System.out.println("컴퓨터가 1~100 사이의 수를 선택합니다.");
				int randomNum = makeRandom(100, 1);
				turn = makeRandom(1, 0);
				System.out.println("컴퓨터가 숫자를 정했습니다. 정답 : "+randomNum);
				System.out.println("<<< Game Start >>> ");
				countnum=1;
				comMax=100;
				comMin=1;
				while(true) {
					if(turn==0) {
						System.out.print("내가 넣은 숫자 : ");
						int findnum = Integer.parseInt(sc.nextLine());
						if(findnum == randomNum) {
							System.out.println("<<< 정   답  >>> ");
							win = win +1;
							System.out.println("당신의 승리!!!!!.");
							if(countnum < bestscore){
								bestscore = countnum;
							}
							comMax = 100;
							comMin = 1 ;
							break;
						}else if(findnum < randomNum) {
							countnum++;	//
							if(comMin < findnum) {
								comMin = findnum+1;
							}
							Respon(1);// up일때
							
							turn=1;
						}else if(findnum > 100) {
							System.out.println("0~100 사이의 숫자를 입력하시오");
						}else {
							countnum++; //
							if(comMax>findnum) {
								comMax =findnum-1;
							}
							Respon(2);// down 일때
							
							//(int)(Math.random()*(max-min+1)+min);
							turn =1;
						}
					}else if(turn==1) {
						
						int AIcomNum = makeRandom(comMax, comMin);
						System.out.println("컴퓨터가 넣은 숫자 : "+AIcomNum); // 컴퓨터가 숫자를 맞출 난수
						//(int)(Math.random()*(num1-num2+1)+num2);
						if(AIcomNum==randomNum) {
							System.out.println("<<< 정   답  >>> ");
							lose = lose +1;
							System.out.println("컴퓨터의 승리!!!!!.");
							comMax = 100;
							comMin = 1 ;
							break;
						}else if(AIcomNum < randomNum) {
							Respon(3);//up일때
							if(AIcomNum > comMin) {
								comMin = AIcomNum+1;
							}
							turn = 0;
						}else {
							Respon(4);//down일때		
							if(AIcomNum < comMax) {
								comMax = AIcomNum-1;
							}
							
							turn =0;
						}
					}else {
						turn=0;
					}
					
				}
				break;
			case 2:
				ShowScore(win, lose, bestscore);
				break;
			case 3:
				systemExit();
				break;
			default:
				System.out.println(" 메뉴를 다시 확인해주세요 ");  // 구지 한줄짜리를 메소드를 사용할려고 3줄 쓰는건 낭비
				break;
			};


		}

	}



}
