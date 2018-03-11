package quiz;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] carr = new char[26];
		char lol = 65;
		//65
		for(int i =0;i<carr.length;i++) {
			carr[i] = (char)(65 +i); // 아스키 코드로 볼것 // char () 치환해줄것 
			lol++;// 치환 필요 X 
		}
		
		System.out.println(carr[0]);
		System.out.println(carr[25]);
	}

}
