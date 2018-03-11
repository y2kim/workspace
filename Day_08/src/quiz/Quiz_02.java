package quiz;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		int max =100;

		for(int i =0;i<arr.length;i++) {
			arr[i] = 100-i;
			max--;
			if(i==0) {
				System.out.println(arr[i]);
			}
			if(i==99) {
				System.out.println(arr[i]);
			}
		}
		//System.out.println(arr[0]);
		//System.out.println(arr[99]);
		
	}

}
