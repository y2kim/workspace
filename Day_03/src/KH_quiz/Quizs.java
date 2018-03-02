package KH_quiz;

public class Quizs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b =10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		b = (byte)i;
		ch = (char)b;
		short s = (short)ch;
		float f = l; // 실수가 정수보다 크기가 큼
		i = ch; // int 범위가 ch보다 크기 때문에 생략 가능
		
		
	}

}
