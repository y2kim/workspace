package study;

import java.util.ArrayList;

class Student3{

	private int StuID ;
	private String StuName;
	private int korSco;
	private int EngSco;
	private int MathSco;

	public Student3(int stuID, String stuName, int korSco, int engSco, int mathSco) {
		//super();
		StuID = stuID;
		StuName = stuName;
		this.korSco = korSco;
		EngSco = engSco;
		MathSco = mathSco;
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

	public boolean Aequals(Student3 obj){
		boolean r = false;
		//if(!(obj instanceof Student)){return false;}
		//
		//  ts =this.getKorSco()+this.getEngSco()+this.getMathSco()
		//  ps= ((Student)obj).getKorSco()+((Student)obj).getMathSco()+((Student)obj).getEngSco()
		//return ts= ps;
		if(this.getKorSco()+this.getEngSco()+this.getMathSco()==obj.getKorSco()+obj.getMathSco()+obj.getEngSco()) {
			r = true;
		}
		return r;
	}

	public boolean equals(Object obj){
		boolean r = false;
		if(!(obj instanceof Student)){
			return false;
		}
		int tsum = this.getKorSco()+this.getEngSco()+this.getMathSco();
		int psum = this.getKorSco()+this.getEngSco()+this.getMathSco();
		
		return tsum==psum;
	}


}


public class Exam_02 {
	public static void main(String[] args) {
		Student3 std1 = new Student3(1000, "jack", 10, 10, 100);
		Student3 std2 = new Student3(1001, "Mack", 30, 40, 50);
		System.out.println(std1.equals(std2));
		
		
	}
}
