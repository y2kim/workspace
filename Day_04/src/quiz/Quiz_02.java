package quiz;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=================");
		System.out.print("이 름 : ");
		String msg = sc.nextLine();
		System.out.println("=================");
		System.out.print("국 어 :");
		int kr = Integer.parseInt(sc.nextLine()); // int 형에서 . 문자로 인식해서 에러난다
		System.out.print("영 어 :");
		int en = Integer.parseInt(sc.nextLine());
		System.out.print("수 학 :");
		int ma = Integer.parseInt(sc.nextLine());
		System.out.println("=================");
		int sumscore = kr + en + ma;
		System.out.print("합 계  : " + sumscore);
		double avg = sumscore/3.00;
		System.out.println("");
		System.out.print("평 균  : " + avg);
		System.out.println("");
		System.out.println("=================");
	}

}
