package exam;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

//call by reference   : 길어질때 
class Handelr2 implements ActionListener{
	JLabel labelText = null;
	
	public Handelr2(JLabel labelText) {
		this.labelText = labelText;
	}
	
	public void actionPerformed(ActionEvent e) {
		labelText.setText("Button Clicked refe");
		Exam_03.labelText2.setText("Button Clicked refe static");
	}
	
}
// new는 항상 주소 
public class Exam_03 extends JFrame{
	
	private JButton buttonEvent = new JButton("Event");
	private JButton buttonEvent2 = new JButton("Event2");
	private JButton buttonEvent3 = new JButton("Event3");
	private JLabel labelText = new JLabel("Message");
	//public static ActionListener Handler3; 
	public static JLabel labelText2 = new JLabel("Message");
	
	private void compinit() {
		this.setLayout(new FlowLayout());
		this.add(buttonEvent);
		this.add(buttonEvent2);
		this.add(buttonEvent3);
		this.add(labelText);
		this.add(labelText2);
		
		ActionListener Handler = new ActionListener() {	// 클래스가 2개인걸 인지해야함 
			//inner class
			public void actionPerformed(ActionEvent e) {
				labelText.setText("Button Clicked inner");
				labelText2.setText("Button Clicked inner static");
				// 익명 클래스  영역  이여서 외부영역의 this 나타내지 않는다  자신의 내부를 찾아 해맴  , 
			}
		};
		
		ActionListener Handler3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				labelText.setText("Button3 change");
			}
		};
		
		this.buttonEvent.addActionListener(Handler);
		this.buttonEvent2.addActionListener(new Handelr2(labelText)); // 주소값 넘어줌 
		this.buttonEvent3.addActionListener(Handler3);

	}
	
	public Exam_03() {
		super("Event Practice");
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.compinit();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Thread() {
			@Override
			public void run() {
				new Exam_03();
			}
		});
	}
}
