package KH_quiz;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		boolean result;
		int result2;
		result2 = x + y;
		System.out.println(x+" + "+y+" = " + result2);
		x= y= 2;
		System.out.println("x ="+ x-- + ", y = "+ --y); // 연산후 대입
		System.out.println("x =" + x + " , y = "+y);
		y = 10;
		result =! ( ((x>y)||(y==x))||((x!=y)&&(x<y)) );
		System.out.println(result);
		System.out.println( (x+2) + " "+(y*3)); // 산술
		System.out.println(x+" ++ 안하고 숫자를 더할시 "+y);
		int z = 3;
		System.out.println( (x+z) + " "+(y-z));
		System.out.println(x+"  변수 계산시 "+y);
	}

}
