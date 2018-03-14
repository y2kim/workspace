package quiz;

import java.util.Scanner;

public class Quiz_01 {
	
	public static int getDesValue(char ch) {  // 글자 한글자를 넘기면 그 글자를 아스키 코드 10진수를 리턴 하는 코드
		// TODO Auto-generated method stub
		int inum =0;
		inum = ch;
		return inum;
	}
	
	public static int getDesValues(char[] ch) {  // 글자 한글자를 넘기면 그 글자를 아스키 코드 10진수를 리턴 하는 코드
		// TODO Auto-generated method stub
		int inum =0;
		for(int i=0;i<ch.length;i++) {
		inum = ch[i];
		}
		
		return inum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0); 
		System.out.println("---");
		char[] charr = new char[10];
		charr = sc.next().toCharArray();
		for(int i=0;i<charr.length;i++) {
			
		}
		int answer =0;
		int answer2 =0;
		getDesValue(ch);
		answer = getDesValue(ch);
		
		System.out.println(getDesValue(ch));
		System.out.println(answer);
		System.out.println("---");
		getDesValues(charr);
		for(int i=0;i<charr.length;i++) {
			//getDesValues(charr);
			System.out.println(getDesValues(charr));
		}
		
	}

	

}
