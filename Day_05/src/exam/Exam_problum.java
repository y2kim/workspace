package exam;

import java.util.Scanner;

public class Exam_problum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //
		System.out.print("메세지 입력 : ");
		String msg = sc.nextLine();
		if(msg.equals("Hello")) { // equals() : 내용을 비교
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		//(msg == "Hello") 이 상태에서는 False 가 된다 
		// 이유는 Exam_0 참조
	}

}
