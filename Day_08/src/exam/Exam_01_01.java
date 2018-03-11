package exam;

public class Exam_01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a; 
		a = new int[4]; // 갯수를 넣을려면 초기값을 주면 안됨
		a[0] = 10 ;
		a[2] = 20 ;
		a[1] = 15 ;
		a[3] = 25 ;
		
		int[] b = new int[]{10,15,20,25};  // 초기값을 넣을려면  갯수를 비워둬야함
		String[] d = new String[] {"Hello","World"};
		char[]c = new char[] {'A','B'};
		
		System.out.println(a.length); 
		// 배열이랑 반복문이랑 궁합이 맞음
		for(int i =0;i<a.length;i++) {
			System.out.print(i+"  ");
			System.out.println(a[i]);
		}
		for(int j =0;j<d.length;j++) {
			System.out.print(d[j]);
		}
		System.out.println("");
		for(int j =0;j<c.length;j++) {
			System.out.print(c[j]);
		}
		
	}

}
