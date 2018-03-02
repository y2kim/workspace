package KH_quiz;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b =10;
		short s = 20;
		char c = 'A';
		int i ;
		float f;
		long l = 100L;
		
		
		s = b ;
		c = (char)b ;
		s = (short)c ;
		c = (char)s ;
		i = (int)100L; // or 100
		l = 500;
		f = l;
		f = (float)5.11;
		
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		
		
		
	}

}
