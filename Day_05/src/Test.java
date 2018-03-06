import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total =0;
		while(true) {
			System.out.print("숫자를 입력하세요 (0은 종료) :" );
			int num = Integer.parseInt(sc.nextLine());
			if(num ==0) {
				break;
				//System.exit(0); 아예 시스템 종료
			}else{
				total = total + num;
				System.out.println("현재까지의 합 : " + total);
			}			
		}
		System.out.println("최종 합은 : " + total);

	}

}
