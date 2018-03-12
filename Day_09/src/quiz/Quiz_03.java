package quiz;

public class Quiz_03 {
	//대문자 A 만 찾는 메소드 작성
	public static int fintA (String str) { // 지역이 나눠져 있어서 중복가능   // 메소드 선언부  // 메소드 별로 스택이 생성
		int sela=0;
		//char[] result = texts.toCharArray(); //한글자식 검사
		/*
		 * int count =0;
		 * for(int i=0;i<result.length;i++){
		 * 	if(rsult[i] =='A'){
		 * 		count++;
		 *  }
		 * }
		 * return count;
		 * */
		char someChar = 'A'; //charAt 사용
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == someChar) {
				sela++;
			}
		}
		return sela;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub  str: 주소
		String str = "AlkejflsdjfaweoifjdaslfiohwefqieffaewifjdalfaEILFJDLJlwfjLD"
				+ "JfqlfijSLDIfjleIFJDSLJflEIJowfjiSDLfkJlwfjidlSIEjfdiSLIDjflEIfjldskjlEJFLQlfj"
				+ "dLASDFJEILAlkejflsdjfaweoifjdaslfiohwefqieffaewifjdalfaEILFJDLJlwfjLDJfqlfijS"
				+ "LDIfjleIFJDSLJflEIJowfjiSDLfkJlwfjidlSIEjfdiSLIDjflEIfjldskjlEJFLQlfjdLASDFJEIL"
				+ "AlkejflsdjfaweoifjdaslfiohwefqieffaewifjdalfaEILFJDLJlwfjLDJfqlfijSLDIfjleIFJD"
				+ "SLJflEIJowfjiSDLfkJlwfjidlSIEjfdiSLIDjflEIfjldskjlEJFLQlfjdLASDFJEILAlkejflsdjf"
				+ "aweoifjdaslfiohwefqieffaewifjdalfaEILFJDLJlwfjLDJfqlfijSLDIfjleIFJDSLJflEIJowfj"
				+ "iSDLfkJlwfjidlSIEjfdiSLIDjflEIfjldskjlEJFLQlfjdLASDFJEILAlkejflsdjfaweoifjdaslf"
				+ "iohwefqieffaewifjdalfaEILFJDLJlwfjLDJfqlfijSLDIfjleIFJDSLJflEIJowfjiSDLfkJlwfj"
				+ "idlSIEjfdiSLIDjflEIfjldskjlEJFLQlfjdLASDFJEIL ";
		
		
		System.out.println(fintA(str));  // 사용구
	}

}
