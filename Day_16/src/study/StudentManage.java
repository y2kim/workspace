package study;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
	private ArrayList<Student> studentDB;
	Scanner sc = new Scanner(System.in);

	public StudentManage() {
		this.studentDB = new ArrayList<Student>();
	}

	public void FirstAddStuednt(Student StudnetMember) {
		studentDB.add(StudnetMember);
	}

	public void AddStuednt(Student StudnetMember) {
		boolean isFind = true;
		for(Student studntInfo:studentDB) {
			if(studntInfo.getStuID()==StudnetMember.getStuID()) {
				isFind = false;
				break;
			}
		}
		//		for(int i=0;i<studentDB.size();i++) {
		//			if(studentDB.get(i).getStuID()==StudnetMember.getStuID()) {
		//				//System.out.println("아이디가 존재 합니다");
		//				isFind = false;
		//				break;
		//			}
		//		}


		if(isFind == true) {
			studentDB.add(StudnetMember);
		}else {
			System.out.println("ID가 중복되었습니다.");
		}
	}

	public int CheckValue() {
		int ckck =0;
		for(Student studntInfo:studentDB) {
			ckck++;
		}
		return ckck;
	}

	public void DelStuednt(int StudnetMember) {
		Student StudnetMembers;
		boolean isFind = false;
		int count =0;

		for(Student studntInfo:studentDB) {
			if(studntInfo.getStuID()==StudnetMember) {
				studentDB.remove(studntInfo);
				System.out.println("해당 학생정보가 삭제 되었습니다.");
				break;
			}else if(studntInfo.getStuID()!=StudnetMember){
				System.out.println("해당 학생정보가 존재하지 않습니다.");
				break;
			}
		}
	}
	public void FixStuednt(int StudnetMember) {
		Student StudnetMembers;
		int nums =0;
		boolean isFind = true;
		for(Student studntInfo:studentDB) {
			if(studntInfo.getStuID()==StudnetMember) {
				nums = studentDB.indexOf(studntInfo);
				System.out.println("바꾸고 싶은 이름  n 입력시 취소");
				String names = sc.nextLine();
				if(names.equals("n")) {
					System.out.println("변경하지 않았습니다.");
				}else {
					studentDB.get(nums).setStuName(names);
					System.out.println("변경하였습니다.");
				}
				System.out.println("국어점수 변경시키고 싶은 점수를 입력하세요  0입력시 취소");
				int kors = 0;
				while(true) {
					try {
						kors = Integer.parseInt(sc.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("숫자를 입력하세요");
					}
				}
				if(kors ==0) {
					System.out.println("변경하지 않았습니다.");
				}else {
					studentDB.get(nums).setKorSco(kors);
					System.out.println("변경하였습니다.");
				}
				System.out.println("영어점수 변경시키고 싶은 점수를 입력하세요  0입력시 취소");
				int engs = 0;
				while(true) {
					try {
						engs = Integer.parseInt(sc.nextLine()); 
						break;
					} catch (Exception e) {
						System.out.println("숫자를 입력하세요");
					}
				}
				if(engs==0) {
					System.out.println("변경하지 않았습니다.");
				}else {
					studentDB.get(nums).setEngSco(engs);
					System.out.println("변경하였습니다.");
				}

				System.out.println("수학점수 변경시키고 싶은 점수를 입력하세요  0입력시 취소");
				int maths = 0;
				while(true) {
					try {
						maths = Integer.parseInt(sc.nextLine()); 
						break;
					} catch (Exception e) {
						System.out.println("숫자를 입력하세요");
					}

				}
				if(maths == 0) {
					System.out.println("변경하지 않았습니다.");
				}else {
					studentDB.get(nums).setMathSco(maths);
				}

				if(maths == 0&& engs == 0 && kors == 0 && names.equals("n")) {

				}else {
					System.out.println("해당 학생정보가 수정 되었습니다.");
				}
				break;

			}else if(studntInfo.getStuID()!=StudnetMember){
				System.out.println("해당 학생정보가 존재하지 않습니다.");
				break;
			}
		}
	}

	public void ScreenStuednt() {
		System.out.println("학생ID\t학생이름\t국어점수\t영어점수\t수학점수\t합계\t평균");

		for(Student studntInfo:studentDB) {
			System.out.println(studntInfo.getStuID()+"\t"+studntInfo.getStuName()+"\t"
					+studntInfo.getKorSco()+"\t"+studntInfo.getEngSco()+"\t"+studntInfo.getMathSco()+"\t"
					+studntInfo.Total()+"\t"+studntInfo.Avg());
		}
	}

}
