package quiz;

import java.util.Scanner;

public class Quiz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("== 등급 측정기 ==");
			System.out.print("당신의 평균점수를 입력해주세요 <0~100> : ");
			int score = Integer.parseInt(sc.nextLine());
			if(90<=score && score<=100) {
				System.out.println("학점은 A 등급입니다.");
			}else if(80<=score && score<90){
				System.out.println("학점은 B 등급입니다.");
			}else if(70<=score && score<80) {
				System.out.println("학점은 C 등급입니다.");
			}else if(60<=score && score<70) {
				System.out.println("학점은 D 등급입니다.");
			}else if(0<=score && score<60) {
				System.out.println("학점은 F 등급입니다.");
			}else{
				System.out.println("점수의 범위가 잘못되었습니다.");
			}
		}
	}

}
