package quiz;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		//int randomnum =(int)(Math.random()*101);
		int tmp =0;
		for(int i=0;i<arr.length;i++) {
			int randomnum =(int)(Math.random()*101);
			arr[i] = randomnum;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i] < arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i]= tmp;
				}
			}

		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
