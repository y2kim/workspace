package exam;

import java.util.Scanner;

//예외전가 - > throw  
public class Exam_02 {
	
	private static void isAllNumber(String str) {
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length;i++) {
			if(!(48<= ch[i] && ch[i] <56 ) ) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		//지금 할건 예외처리 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		//String str = sc.nextLine();
		//Integer.parseInt(str);
		 //try -catch : 예외처리 구문 
		/*
		 * try - catch
		 * try - catch - finally
		 * try - finally
		 * try with resource
		 * */
		
		try {  // - 먼저 만남
			Integer.parseInt(sc.nextLine()); // 예외가 발생될 것으로 예상한 줄을  넣는다.
			// 보통은 에러 발생하면 메인바같으로 팅긴다.  에러 발생하면 catch 쪽으로 들어간다 
			// 에러 안나면 catch 는 건너뛴다.
			System.out.println("입력성공");
		} catch (NumberFormatException/*클래스임 */ e/*<- 변수*//*에러종류를 여기다가 집어 넣는다*/) {   
			
			//보통 에러가 생기면 메인 바같으로 틩겨 나간다 . 프로그램이 종료가 된다  - 그래서 예외 발생할때 처리하는 부분 
			//  상식적으로 예외가  발생했을때 꺼지지 않고 안내를하고 다시 돌려보내야 한다 
			// exception:에외 라는 뜻
			//System.out.println("이세상의 숫자가 아님");
			System.err.println("이세상의 숫자가 아님");
		}catch (NullPointerException ee) {
			//catch를 더 붙여줄수 있다
		}
		
		System.out.println("정상종료");
		
		/*  C 언어 방식
	    //Boolean result = isAllNumber(str);
//		if(result) {
		// 인티저 
//		}else {  
	//	syso 숫자 아님
//		}
		*/
		
	}
}
