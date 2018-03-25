package study;

import java.util.ArrayList;
import java.util.HashMap;

class Student2{
	private int StuID ;
	private String StuName;
	private int korSco;
	private int EngSco;
	private int MathSco;

	public Student2(int stuID, String stuName, int korSco, int engSco, int mathSco) {
		//super();
		StuID = stuID;
		StuName = stuName;
		this.korSco = korSco;
		EngSco = engSco;
		MathSco = mathSco;
	}

	public int getSum() {
		return this.korSco+this.EngSco + this.MathSco ;
	}
	
	public int getStuID() {
		return StuID;
	}
	public void setStuID(int stuID) {
		StuID = stuID;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public int getKorSco() {
		return korSco;
	}
	public void setKorSco(int korSco) {
		this.korSco = korSco;
	}
	public int getEngSco() {
		return EngSco;
	}
	public void setEngSco(int engSco) {
		EngSco = engSco;
	}
	public int getMathSco() {
		return MathSco;
	}
	public void setMathSco(int mathSco) {
		MathSco = mathSco;
	}
//	public boolean equals(Object o) {
//		if(!(o instanceof Student2)) {
//			return false;
//		} // this ,object
//		int thissum = getSum();
//		int getsum = ((Student2)o).getKorSco()+((Student2)o).getEngSco()+((Student2)o).getMathSco() ;
//		return thissum==getsum;
//	}
	
}

public class Exam_01 {
	public static void main(String[] args) {
		
		ArrayList<Student2> list = new ArrayList<>();
		
		list.add(new Student2(1001, "Jack", 10, 20, 30));
		list.add(new Student2(1002, "Mike", 40, 50, 60));
		list.add(new Student2(1003, "Susan", 70, 80, 90));
		Student2 std1 = new Student2(1000, "jack", 10, 10, 100);
		Student2 std2 = new Student2(1001, "Mack", 30, 40, 50);
		String a = new String("Hello");
		String b = new String("Hello");
		list.contains("Mike");  // 오버라이딩이 안될경우    현재 단순 주소로 이루워 졌다    object는 주소 그자체  string은 다름 
								//메소드 안의 내부 주소를 비교하니까  
		System.out.println(list.contains(new Student2(1005, "jane", 20, 20, 20)));
		System.out.println(std1.equals(std2)); //
		//System.out.println(std1.eqauls(new Student2(1009, "Test", 10, 10, 40)));
		System.out.println(a.equals(b)); // string 임 
		
	}
}
