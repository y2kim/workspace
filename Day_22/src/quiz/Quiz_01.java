package quiz;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Quiz_01 extends JFrame{
	
	private JButton button = new JButton("Login");
	//private JLabel label = new JLabel("나 레이블");
	private JTextField textfiled = new JTextField("아이디");
	private JPasswordField password = new JPasswordField("1111");
	private JCheckBox checkbox = new JCheckBox("로그인 상태 유지");
	
	public Quiz_01() {
		super("나 프레임");
		this.setSize(220, 170);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.button.setBounds(112, 15, 81, 81);
		this.add(button);
		this.textfiled.setBounds(10, 15, 100, 40);
		this.add(textfiled);
		this.password.setBounds(10, 56, 100, 40);
		this.add(password);
		this.checkbox.setBounds(10, 96, 130, 30);
		this.add(checkbox);
		this.setLayout(null);// <- 널레이아웃 
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Quiz_01();
	}

}
