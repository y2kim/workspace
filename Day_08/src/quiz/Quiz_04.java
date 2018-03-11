package quiz;

import java.util.Scanner;

public class Quiz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter를 누르면 오늘의 명언을 출력합니다.");
			String up = sc.nextLine();
			int a = (int)(Math.random()*3);
			String[] arr = new String[] {"사람들이 서로 대화를 하며 살아가는 데 가장 중요한 것은 자신이 아는 무엇을 말하는 것보다 무엇을 말하는 지를 아는 것이다."
					,"종교는 일반인에게는 진리이고, 현자에게는 거짓이며, 권력자에겐 유용하다.","분노라는 병은 모든 악을 압도한다. 가장 해로운 것은 숨겨진 분노이다."
			+ " 분노를 떨쳐내려면 아무것도 하지 않는 것이 최선의 방법이다. 분노는 동정에 의해서 치유된다. 분노에서 자기자신을 구하려면 다른 사람이 화내고 있는 모습을 냉철하게 관찰하면 된다.."
			};
			System.out.println(arr[a]);
			System.out.println("");
		}
	}

}
