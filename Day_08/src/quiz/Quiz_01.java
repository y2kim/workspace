package quiz;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
			
			if(i==0) {
				System.out.println(arr[i]);
			}
			if(i==50) {
				System.out.println(arr[i]);
			}
			if(i==99) {
				System.out.println(arr[i]);
			}
			if(i==25) {
				System.out.println(arr[i]);
			}else if(i==75) {
				System.out.println(arr[i]);
			}
		}
		System.out.print("배열의 크기 개수: ");
		System.out.println(arr.length + " 개");
		
	}

}
