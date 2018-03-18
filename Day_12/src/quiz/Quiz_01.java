package quiz;
import java.util.Scanner;
public class Quiz_01 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("===계산기 프로그램 ===");		
		while(true) {
			System.out.print("(Q,q):종료 // 연산자 입력 (+,-,*,/)  : ");
			String multi = sc.nextLine();
			if(multi.equals("Q")||multi.equals("q")) {
				break;
			}else if(multi.equals("+")||multi.equals("-")||multi.equals("*")
					||multi.equals("/")||multi.equals("%")) {  // String 이므로 상관없다.

				System.out.print("첫번째 숫자 입력 : ");
				int num1 =0; // 스코프 문제 피하기 위해서 여기다가 생성   스위치에 영향 받는곳까지 꺼내야함 
				while(true) { // 숫자 다시 입력하기 위하여 와일문 취해줌
					try {
						num1 = Integer.parseInt(sc.nextLine());
						break;
					} catch (NumberFormatException e) {   // 그냥(모든) 예외   그러나 오류 구분 못함
						System.out.println("숫자가 아닌것을 입력하였습니다.");
						System.out.print("다시 입력하세요  : ");
						continue;    // 다시 코드를 다시 위로 올려야함   그래서 반복과 컨티뉴로 사용 
					} catch (NullPointerException ne) {
						System.out.println("값이 입력되지 않았습니다.");
						System.out.print("다시 입력하세요  : ");
						continue; 
					}
				}
				// 사용자 입장을 생각해서 각각 try catch 씌어즴
				System.out.print("두번째 숫자 입력 : ");
				int num2 =0;
				while(true) {
					try {
						num2 = Integer.parseInt(sc.nextLine());	
						break;
					} catch (NumberFormatException e) {
						System.out.println("숫자가 아닌것을 입력하였습니다.");
						System.out.print("다시 입력하세요  : ");
						continue;
					} catch (NullPointerException ne) {
						System.out.println("값이 입력되지 않았습니다.");
						System.out.print("다시 입력하세요  : ");
						continue; 
					}
				}
				System.out.println("===결과 ===");
				switch (multi) {
				case "+":					
					System.out.println(num1+" + "+ num2+" = " + (num1+num2));
					break;
				case "-":					
					System.out.println(num1+" - "+ num2+" = " + (num1-num2));
					break;
				case "*":			
					System.out.println(num1+" * "+ num2+" = " + (num1*num2));
					break;
				case "/":
					System.out.println(num1+" / "+ num2+" = " + ((double)num1/num2));
					break;
				case "%":
					System.out.println(num1+" % "+ num2+" = " + (num1%num2));
					break;
					/*마음 같아서 default 하고 싶지만 타이밍 문제가 있음*/// 논리적으로 말이 안되는 프로그램
				}
			}else{
				System.out.println("잘못된 수식입니다. 다시 입력하시고  리스트확인해주세요");
			}
		}
	}


}

