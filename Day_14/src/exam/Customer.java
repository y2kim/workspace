package exam;
//객체지향적  재활용을 위하여 
/*객체 단위를 만드는 연습
 * 역활 나누는 기준은 현실
 * */
import grade.Sliver;
import grade.Vip;

import java.util.Scanner;

import grade.Gold;
import grade.Manager;
// Critical Issue 3 
/* 클래스간의 관계는 has a , (클래스가 클래스를 가지고 있을때 ) 
 * is a 상속관계  a is a B  a는 b다   - 공통 속성,기능 을 가지고 있을때 사용  Extends
 * --평가기준 : [유지보수,결합도,응집도,가독성]  --
 *1. 코드 중복도 (생성자와,포인트말고 동급)  20개 받을시 20개 만드는 추한 행태가 벌여짐   - 마음의 상처 .. + 물리적 타격 - 요구사항이 들어왔을때 일일이 다 고쳐야 함   - 상속으로 해결  
 * 동작도 되야함    1번 해결 
 * 단일 상속 뿐만 아니라 깊이 있는 상속 가능 하지만 2개이상의 클래스를 상속받는 다중상속을 받을수 없다.  다중상속은 모호성이 충돌할수 있어서 다중상속을 막아놨으나...[반전..]
 * 아직 getbonus 이슈가 남아있음    <- 공통상항이긴 공통이나  내용물은 좀 다름   내용자체가 없어야함 
 * overriding - 부탁  - 에러가 발생 그러나 에러표시 안남 - 부가적인 에러 발생함 - 부탁이 아닌 명령을 해야함
 * 가장 큰 의의는 상속을 받아서 추가기능을 덧 붙일때  + 추상화, 다형성 와 관계 
 * [추상화 + 상속으로 해결]
 * 
 *2. 매니저 클래스 문제  :  결합도가 너무 높다  [서로 의존관계가 높다.]= 바깥쪽에서 변화가 생기면 같이 바꿔야함   결합도가 낮을수록 독립성이 높다는것이다  :낮게 낮춰야함  - 다형성 문법으로 해결 
 * 	이것을 해결 했는가 ?  다향성으로 해결    - 매니저를 더이상 안건들여도 된다 
 * 저장소 문제가 다형성 의문점에 해결될것이다.
 * 
 *3. 저장소 문제 :  우선 배열은 문법적 제약이 있음  몇개가 있는지 밝혀야함  <-  우리가 수요요소를 예측할수가 없다.  - Collection Framework로 해결 DB 
 *프로젝트 규모가 커지면 컴파일 하는데만 시간이 걸린다. 100000칸을 썼다는건 그만큼 메모리 소모
 *동적 배열 사용한다  : 벡터vector(smart array)  연속된 공간된 배열
 *배열 : 순차적이라 입력속도가 빠르다.   사이즈 고정  , 데이터 정렬을 하기 힘듬  
 *----------------
 *Linked list  -> 자료구조  , 주소 ,연결코드   
 *배열 여러개 일때 따로따로 할때  -변--or인스턴스 랑 비슷함    하나만 주소 알면 다 어딘지 알수가 있다
 *
 *
 *벡터의 단점 : 데이터 갯수가 많아지면서 문제 생김   삭제시 여러번 땡김 
 *Linked list 단점 : 삭제가 빠른대신 삽입이 느림 
 *백터와 링크드리스트 둘다 검색속도가 느림     
 *-sort 정렬
 *새로운 구조 
 *
 *hash / Tree
 *tree :  기준점에서   좌우로 크고작고를 비교함  
 *입력속도 느림 , 검색속도가 매우 효울적임  1/2 씩 버리면서 검색해 나감 , 난이도 매우 높음 
 *[] : 변수
 *[][]이상 : collection (변수개 여러개 )       library[오픈소스] = framework[틀딱인 오픈소스]  
 *
 *3번쨰 이슈는 collection framework로 해결  <- ★X10
 *
 *hash :
 *컴파일 타임 - 실횅되면 런타임(실행된 후사이즈 정해짐) - 
 *회원 탈퇴시 중간 페이지 부재 발생 
 * */
public class Customer {

	public static void main(String[] args) {
		Manager m = new Manager(); 
		Scanner sc = new Scanner(System.in);
		// 아이디,이름,점수를 입력 받아야한다.
		// 구성요소부터 만들기 
		while(true) {
			System.out.println("회원 관리 시스템");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 목록 조회");
			System.out.println("3. 시스템 종료");
			System.out.print(">> ");
			String menu = sc.nextLine();
			if(menu.equals("1")) {

				System.out.println("<< 신규 회원 정보 입력>> ");
				//			System.out.println("아이디 : ");
				//			int id = Integer.parseInt(sc.nextLine());
				//			System.out.println("이름 : ");
				//			String name = sc.nextLine();

				//Sliver tmpMember = new Sliver(id, name, 1000); // 인수값 엔터링
				m.addNewMember(new Sliver(1001, "Jack", 1009)/*실버형 참조변수의 주소*/); //
				m.addNewMember(new Sliver(1002, "Brian", 1005));
				m.addNewMember(new Sliver(1003, "Tom", 3500));
				m.addNewMember(new Sliver(1444, "jomusa", 4444));
				m.addNewMember(new Gold(2004, "Joe", 5421));
				m.addNewMember(new Gold(2750, "Daek", 1000));
				m.addNewMember(new Gold(2874, "jomusa", 3124));
				m.addNewMember(new Gold(2004, "Lee", 5421));
				m.addNewMember(new Vip(1548, "vip", 2882));
				//m.addNewMember(new Sliver(9875, "kim", 4487)); // outofindex
				//m.addNewMember(new Sliver(3105, "dack", 9999));
	
				// 생성자가 정의 되지 않았다는 메세지표시됨 
				//new 에서 오류나면 인스턴스에 문제가 있는소리 
				System.out.println("입력이 완료되었습니다.");
			}else if(menu.equals("2")) {
				//
				m.printMemberList();
				System.out.println("출력이 완료되었습니다.");
			}else if(menu.equals("3")) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				break;
			}else {
				System.out.println("메뉴를 다시 확인하세요");
			}

		}// view : 보여주는 파트 
	}
}
	/*
	 * [[main[id,name,point{이 값은 실버 배열에 저장시켜야 한다.}]] [tmpMember]]
	 * []
	 * [[Sliverinstance{name,id,1000}(10000번지)]<-tmp에 의한 인스턴스 ]
	 * []
	 * 메모리 그림은 우리의 현실과 비슷하다    mvc방식
	 * */
