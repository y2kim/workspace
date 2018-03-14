package exam;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exam_01 {

	public static int inputNumber() {   // 둘러싸다  랩퍼 메소드
		Scanner sc = new Scanner(System.in);
		return Integer.parseInt(sc.nextLine()); // 자체 메소드
	}
// 내가 실수 했구나  12345 숫자가 그대로 들어가는구나 100 했다고 100개 생기는게 아니라 이런 병신 ....
	public static int[] toIntarray(int num) { // 오른쪽으로 들어오고 왼쪽으로 나가는값  //  선언부
		char[] arr = String.valueOf(num).toCharArray();
		int[] result = new int[arr.length] ;
		for(int i=0;i<arr.length;i++) {
			result[i] =Integer.parseInt(String.valueOf(arr[i]));
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int num = inputNumber(); // 메소드 부르면 리턴 값 부름 
		int[] result = toIntarray(13425);  // 리턴데이터타입[반환형],(변수) ,메소드[선언명], 매게변수[인자값] // 사용부
		
		String str = "Hello";
		System.out.println(result);
		System.out.println(str.substring(2));  // substring(int 값[인자,인수])  사용부
		System.out.println(str.concat("Test"));
		System.out.println(str.contains("Test"));
		System.out.println(JOptionPane.showInputDialog("메세지를 입력"));
		/*1직관
		 *2.찍고
		 * substring: 뺀다
		 * */
	}
	/*
	 * f(X) = ?
	 * 들어가는 값  나가는 값
	 * */


}
