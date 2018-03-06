package exam;

import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 중에 선택하세요 : ");
		int select = Integer.parseInt(sc.nextLine());
		//char , String
		
		switch (select) { //char , String 형이 올수 있음 -- boolean은 안됨
		case 1:   //응용으로는 1,2 일때 ~~이다 할수 있음
			//System.out.println("one");
			//break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;			
		default:
			System.out.println("Check menu ");
			break;
		}
	}

}
