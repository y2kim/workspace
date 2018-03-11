package quiz;

import java.util.Scanner;

public class Quiz_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] listname = new String[3];
		int[] scorekor = new int[3];
		int[] scoreeng = new int[3];

		for(int i=0;i<listname.length;i++) {
			System.out.print((i+1)+" 번째 학생의 이름 : ");
			String name = sc.nextLine();
			listname[i] = name;	
			System.out.print(listname[i] +" 학생의 국어 점수 : ");
			int score = Integer.parseInt(sc.nextLine());
			scorekor[i] = score;
			System.out.print(listname[i] +" 학생의 영어 점수 : ");
			int score2 = Integer.parseInt(sc.nextLine());
			scoreeng[i] = score2;
		}

		System.out.println("이름   국어    영어    합계   평균");
		for(int i=0;i<listname.length;i++) {
			System.out.println(listname[i]+"  " + scorekor[i] +"  "+scoreeng[i] +"   "+(scoreeng[i]+scorekor[i])
					+"   "+(((double)scoreeng[i]+scorekor[i])/2)  );
		}
	}

}
