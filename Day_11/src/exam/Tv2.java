package exam;

public class Tv2 {
	 String brand; // 이녀석은 패키지  같은 패키지 접근자 
	private int channel /* = 10  가장 빨리 집을 넣을수 있음 [1번째 방법]  (자동Set 값이 없었을때) 값이 추가되면 덮어씌어진다.*/;  // 변수가 없는데 대입
	private int volume;// 여기다가 (디폴트 밸류) 값을 넣을수 있다 3번째    이거는 개발자가 임의로 넣은 숫자
	//인스턴스 대입  개발자의 의도
	// setter가 가장 나중에 변경시킬수 있는데 그게 강하다  : 생성자가 넣은거가 변경시킬수 있음 
	/* 눈에 보이지 않는것들 숨어있음
	//package   // 0은 힙을 쓰기때문에 디폴드 값이다
	//this
	//눈에보이지 않는 생성자
	 * 특이함
	 * 1. 생성자 메소드는 클래스의 이름과 동일 (하나만 생성)
	 * 2. 반환값을 가질수 없다.
	 * 3. 생성자의 메소드의 호출시기는 이미 정해져 있다.
	 * 4. 그외 규칙은 다른 일반 메서드와 동일 
	 * 마음대로 못부름
	 * 
	*/
	// 기본적으로 이렇게 생김 Tv2(){}
	// 생성되는 타이밍
//	Tv2(int channel, int volume){   // 생성자(컨스트럭터 construct)가 매개변수를 만들어야 값 들어감  2개의 기능을 하나로 묶음   [2번째 방법]
//								//super();  숨어있음
//		//사용자  //코드가 깔끔, 편함 
//		this.channel = channel ;
//		this.volume = volume;  
//		// 근데 이게 다임 
//	}
	

	//public Tv2 getThis() {  // Tv2 값을 돌려 받아야 함
	//	return this;
	//}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {  // 사용자   [3번째방법]  // 나중에 변경 계속 
		this.channel = channel;
	}
	
	public Tv2( int channel, int volume) { //사용자로 넘어가는 값   인스턴스가 생성되자마자 생성자가 실행됨 public 없으니 디폴트는 아님
		//new 하면 새로운 Tv가 생성되는게 되므로 효과 없다.   ,처음에 새로 덮을거면
		//super();
		//this.brand = brand;
		// default 생성자 : 암묵적
		/*암묵적 생성자는 지워짐  public private 이거 붙으면   
		 *  묵시적 생성자가 삭제된다   
		 *  Overloading 가능 생성자오버로딩  10-exam04
		 *  */
		this.channel = channel;
		this.volume = volume;
	}
	// 메소드 갯수마다 선택할수 있음
	public Tv2(String hot) {  // 생성자 오버로딩   
		/** 메소드 = 펑션  이름이 겹치는거 허가 안함  : 구분 짓기 위해
		 * 같은 이름에(메소드) 매개변수에 차이를 두자
		 * 이름 하나에 여러게 매개변수를 씀
		 * 타입,갯수에 영향이 기치나  return 은 오버로딩에 영향을 못줌
		 * */
	}

	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	} 
	
	//게터 세터 자동 생성이 있기 때문에   this는 final
	//this 예제 2
	// 초급 끝  -- 이제 중급 
}
