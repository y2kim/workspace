package students;

public class Student {
	
	private int StuID ;
	private String StuName;
	private int korSco;
	private int EngSco;
	private int MathSco;
	
	public Student(int stuID, String stuName, int korSco, int engSco, int mathSco) {
		//super();
		StuID = stuID;
		StuName = stuName;
		this.korSco = korSco;
		EngSco = engSco;
		MathSco = mathSco;
	}
	

	public int Total() {
		return this.korSco+this.EngSco + this.MathSco ;
	}
	
	public double Avg() {
		return (this.korSco+this.EngSco + this.MathSco)/3 ;
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
	
	public String toString() {
		return this.getStuID()+"\t"+this.getStuName()+"\t"+this.getKorSco()+"\t"+this.getEngSco()+"\t"
				+this.getMathSco()+"\t"+this.Total()+"\t"+this.Avg()+"\t";
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) {
			return false;
		}
		return this.getStuID() == ((Student)obj).getStuID();
	}
	
	
}
