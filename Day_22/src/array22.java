
public class array22 {
	public static void main(String[] args) {
		//2중 배열은 바깥부터 읽는다   []<-[]<-[] 2차원 배열은 배열을 묶은 배열  
		int[][] arr = new int[2][2];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		
		int[][] arr2 = new int[5][5];
		
		
		/*
		 * [0,0][1,0]
		 * [0,1][1,1]
		 * */
	}
}
