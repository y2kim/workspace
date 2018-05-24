package gui_exam;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIExam_02 extends JFrame { 
	// JFrame 기본 레이아웃 -border Layout : 동서남북중  위치로 컴포넌트를 분산배치 : 한쪽 방향에 한개만 넣을수 있다. /사이즈 조정 가능 하나  동서(넓이)  남북(높이) 한계 
	// GridLayout : 격자 무늬로 행열을 구분지어 컴포넌트를 배치 // 좆같은놈 
	// FlowLayout :    필요한 만큼 크기만 생성됨 // 인기가 많음 //    
	// 패널을 이용해서 원하는 디자인 가능 
	// 패널을 만들고  컴포넌트를 넣어둔다 
	private JButton button = new JButton("버튼1");
	private JLabel label = new JLabel("레이블");
	private JTextField field = new JTextField("필드1");
	private JPasswordField filed2 = new JPasswordField("필드2");
	private JTextArea area = new JTextArea("asdfhajkwsdfiasdjgklawlrefg"); // 여러줄 입력할수 있는 놈 게시판 같은것
	
	public GUIExam_02() {
		super("나 프레임");
		this.setSize(500, 350);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//this.setLayout(new GridLayout(3,2 ,5,5));  // 매니저라서 밑의 보더는 영향을 받지 않음 
		this.setLayout(new FlowLayout(FlowLayout.LEADING));  
		//this.button.setSize(100, 50); // 레이아웃이 적용이 되있는 상태면 셋 사이즈는 적용안됨
		this.button.setPreferredSize(new Dimension(200,50)); //Dimension 높이와 넓이 합친거  // 보더에게는 절반만 적용
		this.add(button,BorderLayout.WEST);  
		this.add(label,BorderLayout.EAST);
		this.add(field,BorderLayout.NORTH);
		this.add(filed2,BorderLayout.SOUTH);
		this.add(area,BorderLayout.CENTER); //Default
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExam_02();
	}

}
