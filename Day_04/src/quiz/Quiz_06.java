package quiz;

import java.util.Scanner;

public class Quiz_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Java의 반복 횟수 : ");
		// nextint(): 라인이 아닌 버퍼에서 숫자에서 뽑아감   /r/n 남는 문제가 발생함    
		// nextline 쓸때 버그 발생함
		int num = Integer.parseInt(sc.nextLine());
		int lim = 0;

		int clame =0; ;
		while(clame<num){
			clame ++;
			System.out.println("Java!");
		}

//		while( num > lim) {
//			System.out.println("Java!");
//			num--;
//		}
	}

}
