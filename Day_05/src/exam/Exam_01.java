package exam;
import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("===구구단 출력 프로그램 ===");
		System.out.print("1~9 단 선택 : ");
		int num1 = Integer.parseInt(sc.nextLine());// 곱셉할 단 입력
		int begin =1 ; // 곱셈 9단 까지
		if(0<num1 && num1<10) {
			while(begin < 10) {
				System.out.println(num1+" * "+begin+" = "+(num1*begin));
				begin = begin +1;
			}
		}else {
			System.out.println("구구단 아님 비둘기 같은놈아");
		}			
	}
}