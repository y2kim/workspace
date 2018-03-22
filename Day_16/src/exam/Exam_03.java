package exam;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째수 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		calc.setNum1(num1);
		
		System.out.println("두 번째수 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		calc.setNum2(num2);
		
		System.out.println(calc.plus());
		System.out.println(calc.minus());
		System.out.println(calc.mply());
		System.out.println(calc.divide());
		
		
	}

}
