package gui_exam;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
// 기본 프레임 코드 
public class GUIExam_01 extends JFrame{
	
	private JButton button = new JButton("나 버튼임");
	private JLabel label = new JLabel("나 레이블");
	private JTextField textfiled = new JTextField("one and one");
	private JPasswordField password = new JPasswordField("나 패스워...읍읍");
	private JCheckBox checkbox = new JCheckBox("췤! 인더 코리아");
	
	public GUIExam_01() {  // 오보라이딩 코드를 짜기 편해짐  // 프레임
		super("나 프레임");
		
		this.setSize(500, 350);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(button);// 기본적으로 레이아웃 메니저로 적용되어있다
		this.button.setSize(100, 50);
		this.button.setLocation(200, 150);
		this.label.setBounds(5, 5, 70, 30);
		this.add(label);
		this.textfiled.setBounds(150, 5, 100, 30);
		this.add(textfiled);
		this.password.setBounds(370, 200, 80, 30);
		this.add(password);
		this.checkbox.setBounds(5, 150, 120, 80);
		this.add(checkbox);
		
		this.setLayout(null);// <- 널레이아웃 
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExam_01();
		
	}
}
/*
 *[]
 *[]
 *[]
 *[]
 * */
 
 