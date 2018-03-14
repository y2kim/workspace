package exam;

import java.io.CharArrayReader;
import java.util.Scanner;

public class Exam_03 {
	
	public static int myLength(String str) {
		int countChar=0;
		char[] chararr = str.toCharArray();
		
		for(int i=0;i< chararr.length;i++) {
			//chararr[i]
			//if() {  C 언어에서는 Null 값을 잡을수 있어서 렌스 없이 가능은 하다 .. 자바는 불가
			countChar++;
			//}
		}
		
		
		
		return countChar;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "Gello";
		str.length();
		System.out.println(myLength(str));
	}

	

}
