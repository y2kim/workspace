package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.LineBorder;

public class Quiz_02 extends JFrame{

	
	private JLabel upla = new JLabel("제목 : ");
	private JTextField textfile = new JTextField("");
	private JPanel uppa = new JPanel(new FlowLayout());
	
	private JTextArea textarea = new JTextArea("asdfaswdfawsefawefawfawefawefawefawefawefa");
	//private JScrollBar scroll = new JScrollBar();
	private JScrollPane paneArea = new JScrollPane(textarea);
	private JPanel cenpa = new JPanel(new BorderLayout()); // 구지 안 만들었어도 되었다 ..
	
	private JPanel blank = new JPanel();
	private JPasswordField password = new JPasswordField("123456789");
	private JLabel downla = new JLabel("글 비밀번호 : ");
	private JButton botton = new JButton("글등록");
	private JPanel downpa = new JPanel(new FlowLayout());
	
	private void comp() {
		this.uppa.add(upla);
		this.textfile.setPreferredSize(new Dimension(225, 25));
		this.uppa.add(textfile , BorderLayout.CENTER);
		this.add(uppa , BorderLayout.NORTH);
		//this.add(textarea , BorderLayout.CENTER);
		this.getContentPane().add(paneArea);
		this.cenpa.add(paneArea , BorderLayout.CENTER);
		this.textarea.setLineWrap(true);
		this.add(cenpa);
		this.blank.setPreferredSize(new Dimension(30, 20));
		this.downpa.add(blank);
		this.downpa.add(downla);
//		this.password.setPreferredSize(new Dimension(50, 25));
//		this.botton.setPreferredSize(new Dimension(55, 25));
		this.downpa.add(password);
		this.downpa.add(botton);
		this.add(downpa, BorderLayout.SOUTH);
	}
	
	public Quiz_02() {
		super("제목");
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.comp();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
//		try { //디자인 관련 
//		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//		        if ("Nimbus".equals(info.getName())) {
//		            UIManager.setLookAndFeel(info.getClassName());
//		            break;
//		        }
//		    }
//		} catch (Exception e) {
//		    // If Nimbus is not available, you can set the GUI to another look and feel.
//		}
		
		
		SwingUtilities.invokeLater(new Thread() {// 그래픽 전용 쓰레드를 돌려야함   , 메인쓰레드를 이용하지 않는다. focus 같은 경우 //공식으로 사용할것 
			public void run() {
				new Quiz_02(); 
			}
		});
		// 린버스
		
		
	}

}
