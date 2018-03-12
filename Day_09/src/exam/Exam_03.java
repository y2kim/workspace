package exam;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Apple:Orange:Grape";
		String[] newstr =  str.split(":"); // 문장을 문장으로 나눔
		// 특정문가 기준으로 좌우로 나뉨  // 특정문자가 소멸됨  // 
		for(int i=0;i<newstr.length;i++) {
			System.out.println(newstr[i]);
		}
		System.out.println(str);
		System.out.println(newstr);
		
	}

}
