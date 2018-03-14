package quiz;

import java.util.Scanner;

public class Quiz_02 {

	public static String simsimi(String str) { // 음수로 넘어온 데이터에 Hello 라는 단어가 포함된다면
		// 인사를 반환하고  
		// 인수로 넘어온 데이터에 hungty 단어가 포함된다면 메뉴를 추천해주는 3가지중 임의로 반환
		// 둘다 포함 안된다면 왔?
		String answer = null; // 재활용 할려면 사용
		String answer2 = null;
		String re = str;
		String[] foodmenu = new String[] {
				"Pizza","Hot dog","Burger King"
		};		
		
		if(re.contains("Hello") && re.contains("Hungry")) { // 우선순위  short cut
			
			int ran = (int)(Math.random()*3+1);
			if(ran==1) {
				answer2 = "삼겹살";
			}else if(ran==2) {
				answer2 = "볶음밥";
			}else {
				answer2 = "닭갈비";
			}
			
			answer = "Hi Areyou Hangry?  How about " + answer2;
			//System.out.println(answer);
		}else if(re.contains("Hungry")) {
			int ran = (int)(Math.random()*3+1);
			if(ran==1) {
				answer = "How about 라면";
			}else if(ran==2) {
				answer = "How about 만두";
			}else {
				answer = "How about 김밥";
			}
			//System.out.println(answer);
		}else if(re.contains("Hello")){  // if (!(re.contains("Hello")) && !(re.contains("Hungry"))) 부정 조건문 쓸때
			answer = "Hello";
			//return "Hello";
		}else{  // if (!(re.contains("Hello")) && !(re.contains("Hungry"))) 부정 조건문 쓸때
			answer = "What?";
			//System.out.println(answer);
			//return "What";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("대화  : ");
		String talk = sc.nextLine();
		//System.out.println(talk);
		//simsimi(talk);  위의 메소드에 시스아웃 처리했다면 이렇게 ㅇ
		System.out.println(simsimi(talk));
		System.out.print("대화  : ");
		String talk2 = sc.nextLine();
		//System.out.println(talk2);
		simsimi(talk2);
		System.out.println(simsimi(talk2));
	}

}
