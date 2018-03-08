package quiz;

import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 가위 바위 보 게임===");
		while(true) {
			System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보/0.종료) : ");
			int user1 = Integer.parseInt(sc.nextLine());
			if(user1 == 0) {
				System.out.println("시스템 종료 합니다");
				System.exit(0);
			}
			int computer = (int)(Math.random()*3+1);
			System.out.println("=======결과=======");
			if(user1 == 1) {

				System.out.println("당신은 가위를 냈습니다. ");
				switch (computer) {
				case 1:
					System.out.println("컴퓨터는 가위를 냈습니다. ");
					System.out.println("================");
					System.out.println("무승부 입니다.");
					break;
				case 2:
					System.out.println("컴퓨터는 바위를 냈습니다. ");
					System.out.println("================");
					System.out.println("사용자가 졌습니다.");
					break;
				case 3:
					System.out.println("컴퓨터는 보를 냈습니다. ");
					System.out.println("================");
					System.out.println("사용자가 이겼습니다.");
					break;
				}
			}else if(user1 == 2) {

				System.out.println("당신은 바위를 냈습니다. ");
				switch (computer) {
				case 1:
					System.out.println("컴퓨터는 가위를 냈습니다. ");
					System.out.println("================");
					System.out.println("사용자가 이겼습니다");
					break;
				case 2:
					System.out.println("컴퓨터는 바위를 냈습니다. ");
					System.out.println("================");
					System.out.println("무승부 입니다.");
					break;
				case 3:
					System.out.println("컴퓨터는 보를 냈습니다. ");
					System.out.println("================");
					System.out.println("사용자가 졌습니다.");
					break;
				}
			}else if (user1 == 3) {

				System.out.println("당신은 보를 냈습니다. ");
				switch (computer) {
				case 1:
					System.out.println("컴퓨터는 가위를 냈습니다. ");
					System.out.println("================");
					System.out.println("사용자가 졌습니다");
					break;
				case 2:
					System.out.println("컴퓨터는 바위를 냈습니다. ");
					System.out.println("================");
					System.out.println("사용자가 이겼습니다.");
					break;
				case 3:
					System.out.println("컴퓨터는 보를 냈습니다. ");
					System.out.println("================");
					System.out.println("무승부 입니다.");
					break;
				}			
			}else {
				System.out.println("메뉴를 확인해주세요");
				System.out.println("================");
			}
		}


	}

}
