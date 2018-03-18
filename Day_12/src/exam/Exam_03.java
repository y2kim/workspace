package exam;
// 내가 배포하는게 아닌 배포된 라이브러리를 사용해서 만들수 있다 
public class Exam_03 {
// 라이브러리 테스트 하는거는 오래 걸린다 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr  = new int[3];
		// 잘못된 상황을 미리 방지할수 있으면 구지 사용안해도 됨 
		/*
		 * 예외처리로 전부 처리하지 않고
		 * 왜 책임전가가 필요한가
		 * 만든사람이 예측이 할수 없는것을 문제가 생겼을때  전가한다
		 * 라이브러리를 만들어서 전가 
		 * 라이브러리 사용후 배포  
		 * */
		try {
			arr[3] = 10;  //예외 생기면 예외 생긴 지점에서 점프  
			// 예외가 안생기면  그대로 가지만 
			System.out.println("Hello");
		} catch (ArrayIndexOutOfBoundsException e) { // 상황에 따라 발생할수 있을때 사용
			System.out.println("배열의 사이즈를 넘어갔습니다.");
			// TODO: handle exception
		}
	}

}
