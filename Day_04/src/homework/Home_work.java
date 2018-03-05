package homework;

import java.util.Scanner;

public class Home_work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int count = 0;

		while(true) {
			System.out.print("프로그램을 종료하고 싶으면 0을 넣어주세요  실행하실거면 0이외의 숫자를 넣으세요. : ");
			int IOnum = Integer.parseInt(sc.nextLine());
			if(IOnum != 0) {
				System.out.print("소수 판별하고 싶은 숫자를 적으세요 : ");
				int num = Integer.parseInt(sc.nextLine());
				System.out.println("--------------------");
				for(int i=2; i<num;i++) {
					if(num%i ==0){
						count = count +1;
					}
				}
				if(count ==0) {
					System.out.println(num+" 는 소수 입니다.");
				}else {
					System.out.println(num+" 는 소수가 아닙니다.");
				}
				System.out.println("--------------------");

			}else if(IOnum == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
