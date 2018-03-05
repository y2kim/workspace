package quiz;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // 입력한 도구를 만든다.
		
		System.out.print("덧셈할 첫번째 숫자를  넣으세요 : ");//
		int num1 = Integer.parseInt(sc.nextLine()); //
		
		System.out.print("덧셈할 두번째 숫자를  넣으세요 : ");//
		int num2 = Integer.parseInt(sc.nextLine()); //
		
		System.out.println("두 수를 더한 값은 : "+ (num1+num2));
		
	}

}
