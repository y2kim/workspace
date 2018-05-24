package quiz;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Quiz_02 extends JFrame{
	private JButton btn1 = new JButton("△");
	private JLabel label = new JLabel("0");
	private JPanel panel = new JPanel(new GridBagLayout());
	private JButton btn2 = new JButton("▽");
	int a = 0;
	private void compInit() {
		this.add(btn1);
//		this.panel.add(label);
//		this.add(panel);
		this.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(btn2);
		
		ActionListener acl = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a++;
				String num = Integer.toString(a);
				label.setText(num);		
//				String value = label.getText();
//				int number = Integer.parseInt(value);
//				number = number +1;
//				label.setText(""+number);
//				label.setText(String.valueOf(number));
			}
		};
		this.btn1.addActionListener(acl);
		
		ActionListener acl2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a--;
				String num = Integer.toString(a);
				label.setText(num);		
			}
		};
		this.btn2.addActionListener(acl2);
		
	}
	
	public Quiz_02() {
		super("Hello GUI");
		this.setSize(250, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // 윈도우 리스너 가 있으나 패스 
		compInit();
		this.setLayout(new GridLayout(1, 3));
		this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Thread() {
			@Override
			public void run() {
				new Quiz_02();
			}
		});
	}

}
