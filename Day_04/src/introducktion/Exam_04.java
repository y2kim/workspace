package introducktion;

import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("여행하고 싶은 나라는?");
		System.out.println("1.유럽 / 2.미국 / 3.캐나다 /4.중국");
		System.out.print("입력 >");
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) { 
			System.out.println("유럽 좋지만 테러 위험이 있습니다. 알라바크 알라후");	
		} else if(menu == 2) {     //else if 종속성 문법  : 그렇지 않고 만약에
			System.out.println("벌집 되기 좋은 나라 입니다.");
		} else if(menu == 3) {
			System.out.println("춥지만 모든 나라중 제일 낮습니다.");
		} else if(menu == 4) {
			System.out.println("민족성과 개념 바닥인 중궈임 서헬조선.");
		} else {
			System.out.println("나가");
			
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
