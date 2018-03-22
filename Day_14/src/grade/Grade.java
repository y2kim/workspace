package grade;
// 코드중복 막는다
//implement ? 
//override(NOTmust) <-> overloading  구분해야함 !
abstract public class Grade { // new 할수 있음  extends Object가 숨어있다.
	/*클래스 앞에서도  쓰는것은  
	 * new 쓰지 않겠다고 설득하는 뜻 
	 * abstract 붙이면 인스턴트생성이 불가능 하다 (cannot use new)
	 * 애초 상속목적이라는것 설계목적이라는것을  알림 
	 * */
	private int id;
	private String name;
	private int point;
	//생성자와 grade는 중복상황이 아니라  뺀다
	
	public Grade(int id, String name, int point) {
		//super();
		this.id = id;
		this.name = name;
		this.point = point;
	}
	// 코드 
	
	// 각각 수치를 다르게 해서 만들게 된다
	// 여기다가 내버려 둔다.
	
	abstract public double getBonus();// 설득 개발자의 큰그림 //클래스 앞에서도 abstract 붙인다
	//말도 안되는 행동을 예방하기 위해 -> 상속할수있는게  new할수 있기 때문에 
	//그런게 있어 라고 해야함    = abstract
	//abstract =추상적인 
		// 오히려 값이 들어가면 독이 됨  내용이 없는게 맞음
		/*공통요소는 맞긴 맞으나 내용이 동일하지 않음 
		 * (Must)  맞지 않으면 에러나게 해야된다 
		 * */
		//return point*0.04; // 내용을 없앤다.
		// void라고 하면 오버라이딩불가
		// 중괄호 없앤다.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
