package quiz;

public class Quiz_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[7];
		int lotte;

		for(int i=0;i<arr.length;i++) {
			lotte = (int)(Math.random()*45+1);
			arr[i] = lotte;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
				
	}

}
