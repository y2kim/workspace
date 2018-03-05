package quiz;

import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("");
		System.out.println("=====결과======");
		System.out.println("");
		
		if(num1>num2) {  // 여담이지만 젅부 IF 로 할경우 전부 확인을 하므로 CPU 낭비가 됨 
			System.out.println("첫 번째 입력 한 값이 더 크다");
		}else if (num1<num2) {
			System.out.println("두 번째 입력 한 값이 더 크다");
		}else {
			System.out.println("둘다 같다");
		}
	}

}
