package quiz;
//
class CreateThread extends Thread{
	Quiz_01 Q = new Quiz_01();
	@Override
	public void run() {
		while (true) { //Unreachable code : 도착할수 없는 코드
			Q.tarket ++;
		}
	}
}

class CreateThread2 extends Thread{
	Quiz_01 Q = new Quiz_01();
	@Override
	public void run() {
		while(true) {
			Q.tarket --; //Quiz_01.tarket
		}
	}
}

public class Quiz_01 {

	public static int tarket =0;
	
	public static void main(String[] args) {

		//CreateThread CT = new CreateThread();
		//CreateThread2 CT2 = new CreateThread2();
		new CreateThread().start();
		new CreateThread2().start(); // 익명 인스턴스  1회용 용도 
		//CT.start(); // start 할수 있다면  가능 
		//CT2.start();
		while (true) {  
			System.out.println(tarket);
		} // 끝나지 않기 때문에 

		
		// 코드의 흐름이 3개이면 ? 
		
	}

}
