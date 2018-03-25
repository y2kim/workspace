package exam;
// tostring ,eqalse 오보라이딩 
//import java.util.Scanner;

class A{
	public boolean equals(Object obj) { // A 인지 동일한지 확인해야함 
		// 매개변수가 다르면 오버라이딩 되지가 않는다.   그냥 새로운 메소드를 만드는것
		if(!(obj instanceof A)){ // 어떤 타입으로 비교 할건지 하는것  
			// 위의 조건이 없으면 주소말고 비교할것이 없다.    instanceof 왼쪽이 오른쪽인지를 검사 
			return false;
		}
        return (this == obj);
    }
}
class B{
	/*
	 * @return 
	 * @see    hello
	 * */
}


public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		boolean result = a.equals(b);  // 뭐든지 들어갈수 있기때문에 오브젝트로 처리 
		// a의 equals call 
		/*boolean result = a.equals(b);  <- 이 상태에서는 주소를 비교한다.
		 * 주소로 비교하고 싶지 않으면 이퀄즈를 오버라이딩 할수 있다.
		 *  public boolean equals(Object obj (이때 Scanner 주소를 가짐)) {
        return (this(a) == obj);
    	}*/
		System.out.println(result); // 
	}

}
