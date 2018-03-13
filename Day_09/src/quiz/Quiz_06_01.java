package quiz;

public class Quiz_06_01 {

	public static void arr369(int[] num) {
		char[] strint = String.valueOf(num).toCharArray();
		
//		for(int i=0;i<num.length;i++) {
//			strint = String.valueOf(i).toCharArray();
//		} // 값을 받을거가 아니기 때문에 void 형으로 쓰임
		//return strint;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] im = new int[100];
		
		for(int i=0;i<im.length;i++) {
			im[i] = i+1;
		}
		
		arr369(im);
		
			int count = 0;
			
			for(int j=0;j<im.length;j++) {
				if(im[j]=='3'||im[j]=='6'||im[j]=='9') {
					count ++;
				}
				
				if(count==0) {
					System.out.print(im[j]);
				}else {
					for(int k=0;k<count;k++) {
						//System.out.print("짝");
						
					}
				}
				System.out.println("");
				count =0;
			
			//System.out.println(count);
			
		}



	}



}
