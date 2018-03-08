package quiz;

public class Quiz_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1; // num1 = num4+2
		int num2; // num2 < num3
		int num3; //
		int num4 =0; //
		int s1;
		int s2;
		int s3;
		int s4;
		String s;
		//		for(int i=1;i<10;i++) {
		//		
		//		}
		for(int i=1;i<10;i++) {
			num1=i; 
			for(int j=1;j<10;j++) {
				num2=j;
				for(int k=1;k<10;k++) {
					num3 =k;
					for(int l=1;l<10;l++) {
						num4 = l;
						if(num2 < num3 && num1==(num4+2) &&
								(((num1*1000)+(num2*100)+(num3*10)+(num4))+((num4*1000)+(num3*100)+(num2*10)+(num1)))==16456) {

							System.out.print("num1 은 "+num1);
							System.out.println("   num4 은 "+num4);
							System.out.print("num3 은 "+num3);
							System.out.println("   num2 은 "+num2);

						}
					}
				}
			}
		}

		//		for(int j=1;j<10;j++) {
		//			num3 =j;
		//			
		//			for(int k=1;k<10;k++) {
		//				num2 =k;
		//				if(num3+num2==4) {
		//					if(num3>num2) {
		//						System.out.println(num3+"     "+num2);
		//						System.out.println("num2 은 "+num2);
		//						System.out.println("num3 은 "+num3);
		//					}
		//				}
		//			}
		//			
		//		}


	}

}
