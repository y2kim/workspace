package quiz;

public class Quiz_01v {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double random_num1 = Math.random()*10;
		double random_num2 = Math.random()*9+1;
		double random_num3 = Math.random()*(35-20+1)+20;
		double random_num4 = Math.random()*2;
		double some = (int)(Math.random()*10+1) ;
		
		System.out.println("0~9 까지의 랜덤 수 : "+(int)random_num1);
		System.out.println("1~10 까지의 랜덤 수 : "+(int)random_num2);
		System.out.println("20~35 까지의 랜덤 수 : "+(int)random_num3);
		System.out.println("0 또는 1 : "+(int)random_num4);
		System.out.println(some);
		
	}

}
