package exam;

public class Exam_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		char c = 'A';
		char d = 'A';
		String f = "Hello" ;
		String g = "Hello" ;
		String z = new String("Hello");
		
		System.out.println(a==b); //Boolean 값 나옴
		System.out.println(c==d); //관계 연산자 -> T/F 만 나온다
		System.out.println(f==g); //String 형은 다르다, 참조형 자료 : 크기가변적 (cpu : f 라는 스택메모리 사용   데이터는Hip) String pool(==shard data memory)
		//그중 스트링풀에 String 값을 저장한다	[주소값을 저장시킴]//기본형 자료 : 크기고정   (cpu : 스택메모리)
		//기존의 데이터 주소를 검색 해서 반환 (1000번지, 1000번지 를 비교가 된거다 주소값이 동일해서 똑같이 TRUE 나온것이다) 스트링풀() 때문에
		//스택에 a b 생성해도  (ex:int) 에서 a,b  따로 저장함
		//new 힙으로 쓰겠다
		//String b = new String("~~~~")  // 힙 메모리 거쳐서 들어감  
		// 스택에 C(주소) 생성 , 힙에 (주소) 번지 저장
		System.out.println(f.equals(g)); //equals 설명 
		//equals // 문자열은 ==  비교 X 이유는 주소를 비교하는 거이기 때문
		System.out.println(f==z);  // false
		// 예시는 Exam_problum 파일로
	}

}
