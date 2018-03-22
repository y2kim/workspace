package study;

public class StudentInfo extends Student {

	public StudentInfo(int stuID, String stuName, int korSco, int engSco, int mathSco) {
		super(stuID, stuName, korSco, engSco, mathSco);
		// TODO Auto-generated constructor stub
	}


	public int Total() {
		return this.getKorSco()+this.getEngSco()+this.getMathSco();
	}


	public double Avg() {
		return ((this.getKorSco()+this.getEngSco()+this.getMathSco())/3);
	}

}
