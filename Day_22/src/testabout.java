import org.omg.CORBA.DataInputStream;
//import java.io.DataInputStream;
class A{
	void func() throws Exception  {
		// 퍼블릭,프라이빗 접근제한자 같은경우  작은쪽에서 큰쪽으로 가능하나  큰쪽에서 작은쪽으로는 불가능 하다  (pubilc -> private X)  반대는 됨 
	}
}

public class testabout extends A {

//	public void func() {  // 상속 밭은  메소드를 접근제한자 범위를 줄일수가 없음
//		예외는 마찬가지로 작은쪽에서 큰쪽으로는 안되나  큰쪽에서 작은쪽으로 갈수 있다.
//	}
	
	void func() throws InterruptedException{  
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 연산자 우선순위   ++(전위), –(전위)  ##  *, /, &   ##   +, –  ##  <<, >>, >>>  ##  <, >, <=, >= ## &	
 ^
 |
 &&
 ||
 
		 * */
		
		DataInputStream dis;
		 java.io.DataInputStream ddiiss;  // 풀네임    같은 이름을 임포트 할때 구분하기 위해서 
		
		
	}

}
