package exam;

import java.net.Socket;
import java.util.Scanner;

public class Exam_01 {

	public static void func() {
		// try -catch - finally   일일이 작성해야하는 불편함 
		System.out.println(111111);
		Scanner sc = new Scanner(System.in);
		try {
			//Integer.parseInt("123aa"); //check exception
			int a = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Error");
			//return; // 메소드 끝내버리는 키워드 
		} finally { // try 이건 catch 이건  !!무조건 실행되는 코드   가장 마지막 !!
			// 무슨일이든 발생  -> 이쪽으로 
			System.out.println("Finallize");
			if(sc != null) {
			sc.close();
			}
			// 쓰는 이유  : 코드의 내용의 정리    
			//ex) close  해야함 
		}
		
		System.out.println(363465487);
	}
	
	public static void func2() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void func3() { 	// try (with resource     <- Auto closable 인터페이스를 받은애들만 가능) 1.7      ; 이걸로 복수 가능 
		try (Scanner sc = new Scanner(System.in); 
			 Socket sock = new Socket();){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
	
		
		
		//func();
		System.out.println("kkk");
	}

}
