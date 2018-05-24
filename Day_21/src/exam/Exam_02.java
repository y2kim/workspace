package exam;
// 화면을 움직일때 지우고 그리고 하는건다 
// 코드의 흐름을 여러개 이상이 필요하다  이때 사용하는것은 쓰레드 이다 
/* Thread 생성 step 5
 * 1. Thread 클래스를 상속받는 사용자 정의 클래스를 사용한다 
 * 2. public void run()  메서드를 override 한다 // 
 * 3. run 메소드 내부에 병령 처리할 코드를 작성한다  
 * 4. 작성된 사용자 정의 클래스를 기반으로 Instance를 생성한다.
 * 5. 생성된 instance 로 부터 start() 메서드를 호출한다. // native(C) 메소드  
 * */
class MyWorker extends Thread /*step1*/ {  // 에러가 안남  정보1 추상메소드를 가지지 않음 (abs,impl) 정보2 Defaute 클래스   즉 매개변수를 가지지 않음 
	@Override
	public void run() { // 일반 메서드 
		for(int i=0;i<100;i++) {
			System.out.print(i + " ");
		}
	}
}

public class Exam_02 {

	public static void main(String[] args) { // 쓰레드 하나
		// TODO Auto-generated method stub
		MyWorker mw = new MyWorker();
		mw.start();// 이때 쓰레드 생성함  
		// 스레드에 시간 지정 불가    , 운영체제가 조절함   , 시간 배정은 할수 있으나  절대 하지 말것 DeadLock발생 %운영체제 규칙에 맞출것 !
		for(int i=0;i<100;i++) {
			System.out.print(i + " ");
		}

	}

}
