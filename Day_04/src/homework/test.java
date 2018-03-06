package homework;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int count = 0;


				System.out.print("소수 판별하고 싶은 숫자를 적으세요 : ");
				int num = Integer.parseInt(sc.nextLine());
				System.out.println("--------------------");
				for(int i=2; i<=num;i++) {
					if(num%i == 0){
						count = count +1;
					}
				}
				if(count == 1) {
					System.out.println(num+" 는 소수 입니다.");
				}else{
					System.out.println(num+" 는 소수가 아닙니다.");
				}
				System.out.println("--------------------");



			
		
	}

}
