package exam;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Exam_01 extends JFrame{

	public Exam_01() {
		super();
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Thread() {
			@Override
			public void run() {
				new Exam_01();
			}
		});
		
	}

}
