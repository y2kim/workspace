package quiz;

import java.util.Scanner;

public class Quiz_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Java의 반복 횟수 : ");
		int num = Integer.parseInt(sc.nextLine());
		int lim = 0;
		
		while( num > lim) {
			System.out.println("Java!");
			num--;
		}
	}

}
