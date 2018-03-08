package exam;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // 난수예제
		// Math.random();// 난수 생성   //숫자가 나타냄 //실행하는순간 난수 [개념상 : 0~1.0](double형)(실제로는 : 0.0000001~0.99999..)
		int maxnum = 10;
		int minnum = 1;
		double value = Math.random()*(maxnum-minnum+1)+minnum;// 가공 가능
		// 
		//난수 생성공식
		//최소값 :x  
		//최댓값 :y
		/*  math.random*(y-x+1)+x [최소값 :최댓값]
		 * 				 [범위]		[시작점]
		 * */
//		for(int i =1;i<=10;i ++) {
//			System.out.println(value);
//		}
		System.out.println((int)(value));  // 소수점 생략
		
	}

}
