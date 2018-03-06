package quiz;

import java.util.Scanner;

public class quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("===n~m 까지의 합 구하기 ===");
		System.out.print("n 까지 더할 수 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("m 부터 계산할 수: ");
		int sumnum = Integer.parseInt(sc.nextLine());
		int start = sumnum ;

		int total = 0;
		if(num1>=sumnum) {
			while (sumnum <= num1) {	
				total = total + sumnum;	
				sumnum++;
			}
			System.out.println(start+"~"+num1+" 까지의 합은 "+total+" 입니다.");
		}else {
			System.out.println("숫자 오류! 시작점과 끝점 숫자를 확인하시오");
		}

	}

}
