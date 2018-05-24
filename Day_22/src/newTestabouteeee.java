

public class newTestabouteeee {
	
	public static void func() throws InterruptedException { // 불려 지는 아이는 콜리
		// 책임전가 하면 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			// TODO Auto-generated catch block
			String fullly = ie.toString();
			//ie.printStackTrace();
			//기본 Exception 은 마지막에 해놓는것이다.
		}
		
	}
	
	public static void main(String[] args) throws Exception{  // 여기서 전가 하지 말것 !   예외도 객체
		// throws Exception  개발자가 안하겠다  ,  운영체제가 꺼버림 
		func();  // 자기를 부르는 자리로 전가 됨  즉 여기서 해결 하겠다고 하는 거임   // 부른 사람 콜러 
	}
}
