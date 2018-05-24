package exam;

import javax.swing.JOptionPane;

class ththth extends Thread{
	@Override
	public void run() {
		for(int count =10;count>0;count--) {
			System.out.println(count);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
		System.out.println("==Game Over==");
		System.exit(0);
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		String quiz = "public static void main(String[] ar)";
		new ththth().start();
		String msg = JOptionPane.showInputDialog(quiz);
		if(msg.equals(quiz)) {
			System.out.println("성공!");
		}else {
			System.out.println("실패!");
		}
		
		System.exit(0);
	}

}
