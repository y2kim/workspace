package students;

import java.util.Scanner;

public class MainProgram {
	
	public static int Scan() {
		Scanner sc = new Scanner(System.in);
		int sco=0;
		while(true) {
			try {
				sco = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
			}
		}
		return sco;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManage std = new StudentManage();
		Scanner sc = new Scanner(System.in);
		int start =0; 
		while(true) {
			System.out.println("<<학생 관리 시스템>>");
			System.out.println("1. 신규 정보 등록");
			System.out.println("2. 학생 목록 조회");
			System.out.println("3. 학생 정보 삭제");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 프로그램 종료");
			System.out.println("5. 학생 검색");
			System.out.print(">> ");
			int menu =0;
			try {
				menu = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println(" Please Check Fucking Menu");
			}

			switch (menu) {
			case 1:  // 프로그램의 파트와 역활 책임이 있기 때문에  신경을 써야 한다.  그래픽이 들어오면 진짜 신경쓸것 // 디자인 패턴, 코팅패턴
				System.out.println("학번  정보");
				System.out.print(">> ");
				int stuID =0;
				while(true) {
					try {
						stuID = Integer.parseInt(sc.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("숫자를 입력하세요");
					}
				}
				System.out.println("이름  정보");
				System.out.print(">> ");
				String stuName = sc.nextLine();
				System.out.println("국어점수  정보");
				System.out.print(">> ");
				int korSco =0;
				korSco = Scan();
				
				System.out.println("영어점수  정보");
				System.out.print(">> ");
				int engSco =0;
				engSco = Scan();
				
				System.out.println("수학점수  정보");
				System.out.print(">> ");
				int mathSco = 0;
				mathSco = Scan();
				
				if(start == 0) {
					//std.FirstAddStuednt(new Student(stuID, stuName, korSco, engSco, mathSco));
					std.HashAddStuednt(stuID, new Student(stuID, stuName, korSco, engSco, mathSco));
					start = 1;
				}else if(start >= 1) {
					std.HashAddStuednt(stuID, new Student(stuID, stuName, korSco, engSco, mathSco));
					//std.AddStuednt(new Student(stuID, stuName, korSco, engSco, mathSco));
				}
				break;
			case 2 :
				int howman2 = std.HashCheckValue();
				if(howman2 ==0) {
					System.out.println("학생정보가 없습니다.");
				}else {
					System.out.println("학생 정보들");
					//std.ScreenStuednt();
					std.HashScreenStuednt();
				}
				break;
			case 3 :
				int howman3 = std.HashCheckValue();

				if(howman3 ==0) {
					System.out.println("학생정보가 없습니다.");
				}else {
					System.out.println("학생 정보들");
					std.HashScreenStuednt();
					System.out.println("삭제할 학생 ID :");
					int studelID =0;
					try {
						studelID = Integer.parseInt(sc.nextLine());

					} catch (Exception e) {
						System.out.println("숫자가 아닌 값을 넣어 메인으로 돌아갑니다.");
					}
					std.HashDelStuednt(studelID);
				}

				break;
			case 4 :
				int howman4 = std.HashCheckValue();
				if(howman4 ==0) {
					System.out.println("학생정보가 없습니다.");
				}else {
					System.out.println("학생 정보들");
					std.HashScreenStuednt();
					System.out.println("수정할 학생 ID :");
					int stufixID =0;
					try {
						stufixID = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						System.out.println("숫자가 아닌 값을 넣어 메인으로 돌아갑니다.");
					}
					std.HashFixStuednt(stufixID);
				}

				break;
			case 5 :
				System.exit(0);
				break;
			case 6 :
				System.out.println("찾고자 하는 번호가 무엇인지 쓰시오");
				int find = Scan();
				std.findStudent(find);
				break;
			default:
				System.out.println("fuck");
				break;
			}
		}

	}

}
