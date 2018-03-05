package quiz;

import java.util.Scanner;

public class Quiz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);

		System.out.print("1 ~ 100 사이 입력 :");
		int num = Integer.parseInt(sc.nextLine());
		if(num<1 || num>101) {
			System.out.println("지원되지 않는 숫자입니다.");
		}else {
			System.out.println("===결과 ===");
				if(num%2 ==0) {
					System.out.println("입력한 수는 짝수 입니다");
				}else if(num%2 ==1) {
					System.out.println("입력한 수는 홀수 입니다");
				}else {
					System.out.println("니가 쓴건 뭐냐?");
			}
		}
	}

}
