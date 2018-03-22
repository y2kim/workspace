package grade;
// 실버 등급에서 필요할 정보를 생각 
public class Sliver  extends Grade{
	// 정보은닉  안정성을 위하여
	//부모클래스,슈퍼클래스 ,상위클래스 같음  grade
	//하위클래스, 자식클래스 dlived 클래스 slive
	public Sliver(int id, String name, int point) {  // 일일이 느면 귀찮으니 특이한 생성자로 사용
		// is not visible  접근제한자 
		// private 독한이유 
		super(id,name,point); //<- super 부모가르키는 키워드
		
//		this.setId(id);   //<- 최고의 문법은 아님 
//		this.setName(name);
//		this.setPoint(point); // 최고는 생성자호출 
		
		// silver 가 아닌 Grade의 생성자를 부른다.
		
		// 퍼블릭 ㄴㄴ ,패키지 도 마찬가지임 
		// !protected!  <- 애도 정보은닉도 깨트림 
		// 게터세터를 사용을 한다 프라이빗일때
		//super() -일반적으로 많이 사용
	}// public>protected(컨벤션[일종의 멘트  실제로는 다른뜻  관습적인 특징이다])>package>private  
	//Overrodeing 하고 착각 ㄴㄴ   // 매개변수를 갯수를 변경시켜서 쓰는것 
	@Override   //과하다 넘어스다  정확히 무효화 시키다 // 내기능으로 탈바꿈 // 물려받은걸 그대로 쓰지 않겠다고 하는게 정확하다 
	// 라이브러리에서 다운받은걸 다른 기능으로 쓰고 싶으면 오버라이드를 사용  _ 물론 개발자가 허가했을때  // 이거 했을때 고장가능성 있다고 
	
	public double getBonus() {
		return this.getPoint()*0.02;  //  <-접근제한자에 걸림
		
	}
	
}
/* 인스턴스 
 * []
 * []
 * [] <- new 했을시 생성 
 * []
 * 
 * */
