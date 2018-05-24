
class Bank{
	private int money = 1000;

	 synchronized public void withdraw() { // synchronized 다른 스레드가 못들어오게 못함  thread safe  - 대신 포퍼먼스가 줄어둠  비용을 지불한다.
		while(true) {     // cpu의 스케줄링 관련 이슈     이 이슈를 해결 하기위해 동기화를 시켜준다 
			if(money >0) {
				try {Thread.sleep(500);money -= 200;} catch (InterruptedException e) {} //cpu 스케줄러가 시간 점유율을 안줄 가능이 높아져 에러가 될가능 성 높음
				
			}
			System.out.println(money);
			//try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
//vector : safe
//arraylist : un safe
public class Exam_04 {

	public static void main(String[] args) {
		Bank b = new Bank();
		new Thread() {
			public void run() {
				b.withdraw();
			}
		}.start();
		new Thread() {
			public void run() {
				b.withdraw();
			}
		}.start();
		
	}

}
