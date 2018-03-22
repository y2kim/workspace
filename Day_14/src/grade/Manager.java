package grade;

import java.util.ArrayList;

// 외부에서 발생하는 실버나 골드한테 받는것이 많아서 결합도가 높다
// 결합도를 떨어트릴것이다
/*등급이 늘어날때마다  배열과 코드가 많아 진다
 * 다형성을 이용하면 줄일수가 있다 .
 * Grade 자료형   실버와 골드는  grade의 하위 
 * 그래서 grade 형 배열을 만든다
 * */
public class Manager {
//	private Sliver[] slivermembers; // 멤버 여러명이라  실버형 배열을 만든다  // 주소를 저장할 참조변수만 생성죔 // 아직 스택에 없음
//	private Gold[] goldMembers;
	private ArrayList<Grade> members;	
	private String strgra;
//	private int silverIndex =0; // 한바퀴 돌때마다 초기화 됨 
//	private int goldIndex =0;
	private int Index =0;
	// vip 작성안해도 된다.
// 골드가 없으므로 골드형 배열을 만들어야함 
	//정적,지역,매개,전역
	public Manager() { // 할거다 라는 설계도   new 했을때 불러짐
//		this.slivermembers = new Sliver[10];   // 10명만 저장할수 있게  // 이제 배열을 만들었다고 할수있다.
//		this.goldMembers = new Gold[10];
		this.members =  new ArrayList<Grade>(); // Grade 변수를 만든거다 , 인스턴스가 아니라 
		//array 는 스스로 매꾸어 나감
		//abstract  ! new 를 붙일수가 없다.
		//
	}
	public void addNewMember(Grade member) {  // 메소드 추가
		// 멤버필드로 가서 관리 
		//if null 라는 거를 넣으면 어떻게 될까 
		// 만약 여기 지역변수 만들어 지면 지워지고 만들어지고  반복되어  X
		//members.add(member.getId()+"\t"+member.getName()+"\t"+member.getPoint()+"\t"+member.getBonus());
		members.add(member);
		try {
			//members/*2000번지의 1번째 값 */ = member;  //' 10000번지가 넘어옴    // 배열은 고정되어있다 
			
		} catch (Exception e) {
//			Grade[] tmp/*참조(주소담았으니)변수,지역변수*/ = new Grade[members.length*2];
//			int i=0;
//			for( i=0;i<members.length;i++) {
//				tmp[i] = members[i];
//			}
//			tmp[i] = member;
//			/*members주소->*/this.members/*<-*/ = tmp; //가비지 컬렉터 
			//20칸 짜리는 가비지 컬렉터가 가져감  동적인 코드 
			// 움직이는 동적배열
		}
	}
//	//Overloading
//	public void addNewMember(Gold member) {
//		goldMembers[goldIndex++] = member;
//	}
	//모델 
	public void printMemberList() {
		System.out.println("아이디\t이름\t포인트\t보너스");
		// 실버와 골드를 어떻게 구분을 할 것인가 ?
		for(Grade print:members) {
			System.out.println(print.getId()+"\t"+print.getName()
			+"\t"+print.getPoint()+"\t"+print.getBonus());
		}
		
//		for(int i=0; i < members.size() ;i++ ) { // \t 는 8칸란 떨어트리고 줄 맞춤
//			System.out.println(members.get(i).getId()+"\t"+members.get(i).getName()
//					+"\t"+members.get(i).getPoint()+"\t"+members.get(i).getBonus());
//		}
//			System.out.println(((Grade)members.get(i)).getId()+"\t"+((Grade)members.get(i)).getName()
//					+"\t"+((Grade)members.get(i)).getPoint()+"\t"+((Grade)members.get(i)).getBonus()); // cast 형 노력이 필요함 
			//members.get(i) <- 이건 주소가 나옴 
//			if(members[i] instanceof Sliver) {   //instanceof 타입을 찾는다
//				
//			}
//			System.out.println(members[i].getId() +"\t" +members[i].getName()
//					+"\t" +members[i].getPoint()+"\t" +members[i].getBonus());//이때는 값이 들어갔다는 가정하예 있으니
			//getBonus 이녀석은 추상화라 부를수 없다   override,implement 다운캐스팅
			//getBonus 이게 실버인지 골드인지 비교해야한다   오보러딩된데 자동으로 꺼내줌 
		
//		System.out.println("------");
//		for(int i=0; i < goldIndex ;i++ ) { // \t 는 8칸란 떨어트리고 줄 맞춤
//			System.out.println(goldMembers[i].getId() +"\t" +goldMembers[i].getName()
//					+"\t" +goldMembers[i].getPoint()+"\t" +goldMembers[i].getBonus());//이때는 값이 들어갔다는 가정하예 있으니
//		}
		
	}

}
/*
 *stack[main[Manager M](1000번지) ]
 *[]
 *[[(1000번지)Manager instanse[members{2000번지},this]], members{(2000번지)실버형 참조변수들이다->[][][][][]},[(addNewMember)]]
 *[] 
 *
 *객체 배열 
 * */
