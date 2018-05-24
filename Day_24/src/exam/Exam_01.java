package exam;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

public class Exam_01 extends JFrame {
	
	private JCheckBox box1 = new JCheckBox("A");
	private JCheckBox box2 = new JCheckBox("B");
	
	private JRadioButton button1 = new JRadioButton("1"); 
	private JRadioButton button2 = new JRadioButton("2"); 
	private ButtonGroup bg = new ButtonGroup(); // 그룹지정을 해야 라디오 버튼에서 하나만 선택할수 있다.   라디오버튼 체크 버튼 동일현상 
	
	private JToggleButton tButton1 = new JToggleButton("강");
	private JToggleButton tButton2 = new JToggleButton("약");
	
	private JComboBox<String> boxlist = new JComboBox<>();    // 우리가 알고 있는 흔한 드롭박스
	
	private void setXY(GridBagConstraints gbc ,int x ,int y) {
		gbc.gridx = x;
		gbc.gridy = y;
	}
	
	private void compInit() {
		// 사이즈 벗어나지 않게  주의  // 리스트 형이랑 닯아서 다 넣을수 있다
		boxlist.addItem("1");
		boxlist.addItem("2");
		boxlist.addItem("3");
		
		GridBagConstraints gbc = new GridBagConstraints(); // 그리드백에 조건을 부여할때 
		gbc.insets = new Insets(3,3,3,3); // 좌우상하 공백 
		
		tButton1.setBorder(new LineBorder(Color.GREEN));
		tButton1.setBorderPainted(true);
		tButton1.setPreferredSize(new Dimension(50, 50));
		
		
		setXY(gbc, 0, 0);
		this.add(tButton1,gbc);
		// 좌표를 많이 떯어 트려봤자야 가운데가 공백이면 붙는다  // 공간 사이가 찌그러짐 
		setXY(gbc, 2, 2);
		this.add(box2,gbc);
		setXY(gbc, 1, 1);
		this.add(button1,gbc);
		setXY(gbc, 3, 3);
		this.add(boxlist, gbc);
		
//		this.add(button2);
//		this.add(tButton1);
//		this.add(tButton2);
		
	}
	
	public Exam_01() {
		super("swing compone");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setLayout(new FlowLayout());
		this.setLayout(new GridBagLayout()); // 사이즈, 여백 조정 가능  // 동적 그리드 // 기본 설정일때 정중앙 기준으로 배치
		this.compInit();
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
