package quiz;

import java.util.Arrays;

public class Quiz_06_02 {

	public static String Change(int[] num){
		String carray= Arrays.toString(num); //그녕 배열출력 
		String change[]=new String[num.length];
		String world1 = "3";
		String world2 = "6";
		String world3 = "9";
		for(int i=0;i<num.length;i++){
			change[i]=String.valueOf(num[i]);
			if(carray.indexOf(i)=='3'||carray.indexOf(i)=='6'||carray.indexOf(i)=='9'){
				System.out.println("짝");
			}else{
				System.out.println(change[i]);
			}
		}
		return carray;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] im = new int[100];
		for(int i=0;i<im.length;i++){
			im[i] = i+1;
		}
		Change(im);
		int count=0;
	}

}
