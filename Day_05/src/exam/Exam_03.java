package exam;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;

		for(i=1;i<=10;i++) { //초기화, 조건문 , 증감문
			//System.out.println("전"+i);
			if(i==2||i==5) { //4까지 나옴 
				continue; // break :  }00 밖으로//continue:  괄호 안으로 00}(그냥 올라간다)//
			}
			System.out.println(i); //1,3,4,6,7,8
			if(i==8) {
				break;
			}
			//continue 있을시 위 실행문 생략하고 여 위치로 오게됨
		}
		//break 만날시 여기부터 시작함
		//break 시 여기 학인 System.out.println("후"+i);
	}

}
