package gui_exam;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIExam_03 extends JFrame {
	
	private JButton button1 = new JButton("버튼1");
	private JButton button2 = new JButton("버튼2");
	private JPanel panelSouth = new JPanel(new GridLayout(1, 2)); 
	//-- panel 하단  버튼 2개 구성
	private JButton button3 = new JButton("버튼3");
	private JButton button4 = new JButton("버튼4");
	private JPanel panelEast = new JPanel(new GridLayout(2, 1)); 
	// -- panel 우측 버튼 2개 구성
	private JButton button5 = new JButton("버튼5"); 
	private JPanel panelSouth2 = new JPanel(new GridLayout(1, 2)); 
	// -- panel 하단 패널과 버튼 융합 구성
	private void compInit() {
		this.panelSouth.add(button1);
		this.panelSouth.add(button2);
		this.add(panelSouth , BorderLayout.SOUTH);
		
		this.panelEast.add(button3);
		this.panelEast.add(button4);
		this.add(panelEast, BorderLayout.EAST);
		
		this.panelSouth2.add(panelSouth);
		this.panelSouth2.add(button5);
		this.add(panelSouth2, BorderLayout.SOUTH);
	}
	// 나만의 코드 스타일 가질것 
	public GUIExam_03() {
		super("나 프레임");  // 타이틀바, 캡션이라 부르기도 한다 .
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		this.compInit();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new GUIExam_03();
	}

}
