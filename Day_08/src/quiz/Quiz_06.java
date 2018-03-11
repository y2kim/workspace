package quiz;

public class Quiz_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5]; // 연속적인공간 5개
		//int[] mixarr = new int[] {1,2,3,4,5};
		int mulnum;
		//int mulnum2;
		//int tmp;
		/*2가지 방법 겹치지 않게
		 * 1.a,b돌리고,c돌리고,d돌리고,e  난수 비교 //hard
		 * 2.또 하나의  같은 배열 1~5 다 집어넣음  난수값 x 생성   난수값y 생성  swap
		 * int tmp = temp[x]
		 * temp[x] = temp[y]
		 * temp[y] = tmp;
		 * */
		//arr[i] = (int)(Math.random()*5+1);
		for(int i=0;i<arr.length;i++) {					
			mulnum = (int)(Math.random()*5+1);
			//mulnum2 = (int)(Math.random()*5+1);
			arr[i] = mulnum;
			for(int j=0;j<i;j++) {   // 1번 방법
				if(arr[i] == arr[j]) { //ex : arr[1] 비교 arr[0]
					i--;
					break;
				}
			}		
			//mixarr[i] = mulnum2;			
//			tmp = mixarr[i];
//			mixarr[i] = arr[i];
//			arr[i] = tmp;
		}

		for(int i=0;i<arr.length;i++) {
			//System.out.println(mixarr[i]);

		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
