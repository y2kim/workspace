package quiz;

public class Quiz_06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		int[] tarket = new int[3];
		int[] arr = new int[] {1,2,3,4,5};
		int[] num2 = new int[100];

		for(int i=0;i<100;i++) {
			
			int mulnum= (int)(Math.random()*5);//0~4
			int mulnum2= (int)(Math.random()*5);//0~4
			
			int tmp = arr[mulnum]; 
			arr [mulnum] = arr[mulnum2];
			arr [mulnum2] = tmp;
		}

		tarket[0] = arr[0];
		tarket[1] = arr[1];
		tarket[2] = arr[2];
		// 카드섞기 알고리즘
		for(int j=0;j<num.length;j++) {
			num[j] = arr[j];
			System.out.println(num[j]);
		}
		System.out.println("-----------------------");
		for(int j=0;j<num.length;j++) {
			num2[j] = arr[j];
			System.out.println(num2[j]);
		}
		
		System.out.println(tarket[0]+"  "+tarket[1]+"  "+tarket[2]);
		
		
	}

}
