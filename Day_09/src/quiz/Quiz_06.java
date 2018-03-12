package quiz;

public class Quiz_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] im = new int[100];

		for(int i=1;i<101;i++) {
			char[] arr = String.valueOf(i).toCharArray(); // 이 개념을 몰랐던듯
			int count =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]=='3'||arr[j]=='6'||arr[j]=='9') {
					count ++;
				}
			}
			if(count==0) {
				System.out.print(i);
			}else {
				for(int k=0;k<count;k++) {
					System.out.print("짝");
				}
			}
			System.out.println("");
			count =0;
		}






	}

}
