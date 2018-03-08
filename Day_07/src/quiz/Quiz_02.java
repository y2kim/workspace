package quiz;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10000보다 작은 소수중 가장 큰 것
		// primenum
		int lagenum =0;
		int min ;
		int count =0;
		System.out.println("10000 이하 숫자중 가장 큰 소수는");

		for(min=2;min <10001;min++ ) {
			for(int i=2; i<min;i++) {
				if(min%i ==0){
					count = count +1;
				}
			}
			if(count==0) {
				if(lagenum < min) {
				lagenum = min;
				}
			}
			count =0;
			
		}
		System.out.println("가장 큰 소수는"+lagenum);

	}

}
