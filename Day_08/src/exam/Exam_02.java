package exam;

public class Exam_02 {

	public static void main(String[] args) {
		// swap 기법
		char[] A = new char[2];
		char tmp;
		A[0] = 'A';
		A[1] = 'B';
		System.out.println(" " + A[0] + A[1]);
		tmp = A[0];
		A[0] = A[1];
		A[1] = tmp;
		System.out.println(" " + A[0] + A[1]);
		
	}

}
