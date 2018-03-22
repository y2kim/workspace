package exam;
// 다[많을다]형[형태]성[성질]
/*多形成
 * 현실예시  영화 : 터미네이터2 T1000 , 혹은 엑스맨 미스틱
 * 자바 : 변수 하나가 있는데 자료형이 여러형태로 바꿀수 있다.  변수가 하나인데 자료형이 여러개 
 * 상속관계를 갖고 있는 클래스만 가능
 *  
 * 
 * */
class A{ // 상위 클래스
// B의 주소를 저장 가능 
	public void funcA() {
		System.out.println("나 A");
	}
}
class B extends A{ // 하위 클래스 
	public void funcB() {
		System.out.println("나 B");
	}
	public void funcA() { // 인스턴스 A로 감 
		System.out.println("나 B");
	}
	
}

class C extends A{
	public void funcC() {
		System.out.println("나 C");
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		A a = new A(); // 
		B b = new B();
		//--------
		A c = new B(/*실버,골드  자동으로 맞는 거를 한다*/); // A를 상속받아서 A를 인지   //  자신을 상속받는 애들만 가능 함   상위 클래스의 점을 찍으면  참조가 A 면 딱 A 기능밖에 안보임 
		// B의 기능을 쓰고싶으면 다운캐스팅사용하거나  , 오버라이딩 임플리먼트가 된건 사용할수가 있다.
		//c. 찍으면  A의 내용을 나타낸다.
		c.funcA();  // A를 보고 있는것이다. funB()는 보고있지 않기 때문에   // <-  [ 프로모션 발생: 여기선 업 캐스팅   up casting]
		/*B의 기능을 쓸수 있다    형태를 많이 가지고 있는 성질
		 *  B형을 캐스팅을 해야함
		 *  A[]  A형은 큰 자료형                                     [ 프로모션 발생: 여기선 업 캐스팅   up casting]
		 *  B[{}{}]  B형은 작은 자료형   
		 *  */
		((B)c).funcB();    // <- 사용방법   위에 있던 자료형이 아래로 끌어져 했다해서 다운 캐스팅 Down casting   다운캐스팅 해야함   모조리 다 쓸수 있음 
		//---
		A d = new C();
		//B d = new A();// B의 내용이 없으니 에러 
		/*자바에서
		 * 상위 클래스 참조변수는 자신을 상속받는 하위클래스 인스턴스의 주소를 저장할수 있다.
		 * A가 다형성을 가지게 됨 
		 * 
		 * 다운 캐스팅 안하고도 사용할수 있는 방법 
		 * Overriding 
		 * */
		c.funcA();  // Overriding  해면 다운 캐스팅을 안해도 된다.
		/* 뭐가 충분하지 않은가   : 동일한 능력  */
	}
}
