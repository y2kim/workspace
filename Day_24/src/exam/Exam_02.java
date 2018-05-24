package exam;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Exam_02 extends JFrame{
	
	private JLabel labelText = new JLabel("가나다라");
	private JLabel labelText2 = new JLabel("가나다라");
	private JLabel labelText3 = new JLabel("가나다라");
	
	private void compInit() {
		Font myFonte = null;
		Font styleFont2 =null;
		Font styleFont3 =null;
		try {
			 myFonte = Font.createFont(Font.TRUETYPE_FONT, new File("yanoljaBold.ttf")).deriveFont(30f);
			 styleFont2 = Font.createFont(Font.TRUETYPE_FONT, new File("Binggrae.ttf")).deriveFont(30f);
			 styleFont3 = Font.createFont(Font.TRUETYPE_FONT, new File("Kimhoon.ttf")).deriveFont(30f);
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.labelText.setFont(myFonte);
		this.labelText2.setFont(styleFont2);
		this.labelText3.setFont(styleFont3);
		this.labelText.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelText2.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelText3.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(labelText);
		this.add(labelText2);
		this.add(labelText3);
	}

	public Exam_02() {
		super("swing compone");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout()); // 사이즈, 여백 조정 가능  // 동적 그리드 // 기본 설정일때 정중앙 기준으로 배치
		this.compInit();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Thread() {
			@Override
			public void run() {
				new Exam_02();
			}
		});
	}

}
