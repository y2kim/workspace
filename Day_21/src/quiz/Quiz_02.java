package quiz;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



class CountDown extends Thread{
	int count =10;
	@Override
	public void run() {
		try {
			Thread.sleep(503);
			Thread.sleep(716);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(count =10;count>0;count--) {
			System.out.println(count);
			try {
				Thread.sleep(1219);
				Thread.sleep(416);
			} catch (Exception e) {}	
		}
		System.out.println("==Game Over==");
		System.exit(0);
	}
}

class MixWord extends Thread{
	@Override
	public void run() {
		
	}
}

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		CountDown rule = new CountDown();
		//List<String> StringList = new ArrayList<>();
		String[] quizs = new String[] {
				"public static void main(String[] ar)","Scanner sc = new Scanner(System.in)","Hey What's up doc? do you know da way"
		};
//		StringList.add("public static void main(String[] ar)");
//		StringList.add("get out dunce you make crazy me throw damn coffe");
//		StringList.add("Hey What's up doc? do you know da way");
		
		rule.start();
		while(true) {
			count ++;
			int rannum = (int)((Math.random()*3));
			//String msg = JOptionPane.showInputDialog(StringList.get(rannum));
			String msg = JOptionPane.showInputDialog(quizs[rannum]);
			if(msg.equals(quizs[rannum])) {
				System.out.println("성공!");
				rule.count = rule.count+5;
			}else {
				System.out.println("실패!");
				rule.count = rule.count-2;
			}
			
		}
	}

}
