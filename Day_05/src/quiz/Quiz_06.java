package quiz;

import java.util.Scanner;

public class Quiz_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===계산기 프로그램 ===");	
		while(true) {			
		System.out.print("(Q,q):종료 // 연산자 입력 (+,-,*,/)  : ");
		String multi = sc.nextLine();
		
		if(multi.equals("+")) { //||multi.equals('-')||multi.equals('*')||multi.equals('/')
			System.out.print("첫번째 숫자 입력 : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("두번째 숫자 입력 : ");
			int num2 = Integer.parseInt(sc.nextLine());	
			System.out.println("===결과 ===");
			System.out.println(num1+" + "+ num2+" = " + (num1+num2));
			
		}else if(multi.equals("-")){
			
			System.out.print("첫번째 숫자 입력 : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("두번째 숫자 입력 : ");
			int num2 = Integer.parseInt(sc.nextLine());	
			System.out.println("===결과 ===");
			System.out.println(num1+" - "+ num2+" = " + (num1-num2));
			
		}else if(multi.equals("*")) {
			
			System.out.print("첫번째 숫자 입력 : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("두번째 숫자 입력 : ");
			int num2 = Integer.parseInt(sc.nextLine());	
			System.out.println("===결과 ===");
			System.out.println(num1+" * "+ num2+" = " + (num1*num2));
			
		}else if(multi.equals("/")) {
			
			System.out.print("첫번째 숫자 입력 : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("두번째 숫자 입력 : ");
			int num2 = Integer.parseInt(sc.nextLine());	
			System.out.println("===결과 ===");
			System.out.println(num1+" / "+ num2+" = " + ((double)num1/num2));
			
		}else if (multi.equals("q")||multi.equals("Q")){
			System.out.println("시스템을 종료합니다");
			break;
		}else {
			
			System.out.println("틀린수식입니다. 다시 입력하시고  리스트확인해주세요");
		}
		
		}

	}

}
