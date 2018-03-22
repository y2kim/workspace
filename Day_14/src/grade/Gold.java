package grade;
// 동일한데 왜 골드를 만ㄷ는가?  - 는 상속의 필요성을 설명하가 위해서
//예제 
//Grade 상속함  추상 메소드를 물려 받음 
// Bonus 가 값이 없기때문 에러
public class Gold extends Grade{
	//메인은 테스트 
	//extends : 확장의 의미 
	/*Grade가 있다
	 * 상속 : 물려받는행위 
	 * */
	public Gold(int id, String name, int point) {
		super(id, name, point);
	}
	/*해결 2가지 
	 * 또 추상화 .. 붙여도 되나  인스터스를 생성해야 하므로 붙이면 X
	 * Overriding 을 해야함 
	 * */
	// 지금은 implement 로 바뀜  
	// 내용 없는걸 물려 받으면서 채워주는 것 즉  implement=구현하는것이다 
	// 같이 abstrack 붙은 메소드 변수를 전부 똑같이 다 써줘야 한다   설계도 ->오로지 추상메소드만 (인터페이스): 전문화 클래스 //전부 섞인것 : 추상클래스 // 어떤게 필요하고 설계하는것 
	// 설계자들 
	public double getBonus() {	
		return this.getPoint()*0.04;
	}
	/*implement : 강요  :abstract 붙을때  : 팀리더 작업  : 함께 쓸수 있는 실시간 솔루션 
	 * override : 추천  :없었을때   
	 * 사용법은  비슷
	 * */
	
	
	//눈예안보이게 Grade 부터 물려받은거 ,this ,생성자(super)   있다
	// 인수값이 없어서  매개변수를 3개받는  
	//grade 받는 생성자가 없기 때문  
	// 오버로딩은 에러 피하기 위한거
}
/*
 * 
 * []
 * []
 * []
 * []
 * */
 