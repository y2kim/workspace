import java.util.Scanner;

public class other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("출력:");
		String a = sc.nextLine();
		//System.out.print("출력:");
		String b = "ABCD";
		
		if(a.equals(b)) {
			System.out.println("같은 단어입니다");
		}else {
			System.out.println("일치하지 않음");
		}
	}

}
