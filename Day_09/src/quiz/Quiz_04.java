package quiz;

public class Quiz_04 {
	
	public static int myRandom(int min, int max) {
		int randomnumber = (int)(Math.random()*(max-min+1) +min);
		return randomnumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(myRandom(5,20));// 5~20의 난수
		}
	}

	

}
