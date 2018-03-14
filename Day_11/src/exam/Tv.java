package exam;

public class Tv {  
	// Tv의 멤버필드  메소드,변수
	/*  메인을 탑재하는 용도 아님    채널정보,볼륨정보,브랜드*/
	// 속성은 변수
	// 지역이 만들어 졌다가 끝나면 사라지는 지역변수  그러나
	// 여기(클래스)는 설계도  
	/*	
	  */
	public String brand;
	private int channel;  // <- 현재 이상태에서 쓰레기 값   ,스택에서 쓰면 쓰레기 값(기본형 은 스택임)  그러나 여기선 멤버 변수다.
	// 인스턴스  만들었을때 [new : 힙을쓰겠다] 호출 
	// 값을 집어 넣기위한 집어넣고 꺼내기 위한 거가 필요하다 
	// 값 집어 넣을때 Set   값 불를때 Get
	
	/*
	 * 힙 메모리 에서 만듬   힙에 잡힘
	 * 값을 안주면 기본 0
	 * String 은 Null  
	 * 0번지 는 비어있느값 
	 * */
	// private 매우 독함 	  Tv 중괄호 안에서만 접근 가능
	private int volume; /*
	// 아직 메모리에 만든게 아님 
	//new 하고 인스터스해야 만들어짐 
	// 인스턴스 사라져야  사라짐
	 * 정확히는 멤버 변수 가 맞는말
	 * 
	 * */
	
	public int/*보내야 하는 타입*/ getChannel() { // 값을 꺼내야 함    내보내는것이 목적  매개변수는 구지 필요없음
		/*리턴 통해서 값 */
		
		return channel;
	}
	/**/
	//lg.setChannel(~~)  값을 받아서 이쪽으로 
	public void setChannel(int channel/*매개변수   , 스택*/) {  // 밖같에서 집어 넣어야 하기 때문에 public
		// 간접 접근  
		// 외부에서 값을 집어넣는것만이 목적  그래서 return 값이 필요없어서 void 
		/*
		 * 집어넣는거 자체가 매개변수
		 * 매개변수 : 받고자 하는값
		 * */ 
		// 중첩이 허가된 상태에서 스택에 스택  : 매개변수에 매개변수에 넣어버린거임 
		this/*멤버필드는 언제나 살아있기 때문에 매개변수 는 있어도 끝나면 사라지기 때문에*/.channel/*멤버필드  힙*/ = channel; // 경우의 수가 여러개 나올수 있음
		// 이름이 중복 되나 에러가 안남 /  서로 다른 영역에 있을때 / 메모리가 다르니
		// 의미 가 없는 상태  :::::: channel = channel;  뭐가 뭐를 넣는다는건지 헷갈림
		//this(멤버필드을 가르킴).channel = ch;   바깥의 매개변수가 안보이니 
		// 바깥에서 점 찍은거랑 같은 상황임 
	}
	/*heap
	 * [{채널,음량 (잠김)}[][]		]
	 *  같은 클래스 내부만이 건들어짐 
	 *  
	 *  
	 *  main stack [LG(주소번지)		]
	 *  . 찍으면 프라이빗은 못봄
	 * */
	public void setVolume(int vol) {  // 이름은 세터스 setter   세팅한다고 해서 
		// 메인에서 받아온 값은 받아옴
		volume = vol;
	}
	//필수가 아닌것들은 명분을 찾아야 함
	public int getVolume() { //getter 게터스  값을 얻는다 해서 
		//웹으로 넘어가면 중요도가 확 올라감
		//약속이 있음 
		return volume;
	}
	/*
	 * Package(Default) , Protected[상속개념] 은 나중에
	 * 숨어있는 코드가 있음
	 * this  ;
	 * [Tv[] ]\
	 * -         {new }
	 * [[~~~~~]]/
	 * 인스터스 안에서는 어떤 코드가 있는지 확인이 힘드니
	 * 내부에서 . 찍고 확일할수 있는 코드가 This(나 자신) 
	 * 코드가 겁나 길때  편하게 볼려고 
	 * -  this = 자기 참조 변수
	 * [Tv lg[주소]]
	 * 
	 * [[변수(this[무조건 생성],[만들어진 인스터스 주소(즉 자기 주소)])메소드]]
	 * 매개변수를 
	 * this 은 
	 * */
	
	public int infochanal ;
	private int jumin ;
	// 하지만 이것보다 더 많을것이다
	// 기능은 메소드
	/* 프라이빗  - 메소드  는 권유 
	 * 
	 * */
	void powerOn() {  // 멤버 메소드
		
	}
	void powerOff() {
		
	}
	void chanalUp() {
		channel +=1;
	}
	void chanalDown() {
		// 설계자 계획대로 조절할수 있게 
		if(channel >0 ) {
			channel -=1;  // 음수에 내려가지 못하게 if 걸어버림
		}
		// 무슨짓 하든 음수로 못내려감
	}
	// 참조 자료형
}


/*
 * String pool  
 * String s1 = "Hello";   평범하게  유일하게 New 안붙임
 * 2000번지를 가지고 있음
 * 메모리 영역에서  주소 나오고
 * 힙의 스트링풀 영역에  들어감
 * String s2 = "Hello";
 * 2000번지를 가지고 있음
 * s1==s2  true
 * String s3 = new String "Hello"; 
 * String s4 = new String "Hello";
 * 일단 Hello 는 전부 스트링 풀에 있다.
 * s3 == s2 false 
 * [new 무조건 인스턴스]C는 지정해야함
 * s1,s2 : 직접적으로 Hello  가르킴
 * 딱히 String 은 new 안 붙여도 됨 
 * s3 인스턴스만들어지고 , 인스턴스가 Hello
 * s4 인스턴스만들어지고 , 인스턴스가 Hello
 * s3 == s4 false  인스턴스가 2개가 따로 나눠줘 있고 인스턴스가 가르키고 있다.
 * equals 은 Hello 내용자체를 비교 함
 * */
