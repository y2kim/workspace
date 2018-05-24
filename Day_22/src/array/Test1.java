package array;

public class Test1 {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
		double sum =0;
		double avg=0;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				sum = sum + array[i][j];
			}
		}
		avg = sum/16;
		System.out.println(sum);
		System.out.println(avg);
	}

}
