package quiz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

import exam.Exam_01;

public class Quiz_01 extends JFrame{
	
	
	private JPanel uppanel = new JPanel(new GridLayout(2, 1));
	private JPanel cekBtnpan = new JPanel(new GridBagLayout());
	//--
	private JLabel toplabel = new JLabel("관심있는 분야를 선택해보세요 (여러개 선택 가능)");
	private JCheckBox box1 = new JCheckBox("IT");
	private JCheckBox box2 = new JCheckBox("연예");
	private JCheckBox box3 = new JCheckBox("음악");
	private JCheckBox box4 = new JCheckBox("스포츠");
	//------
	private JPanel cenpanel = new JPanel(new GridLayout(1, 2));
	private JPanel radBtnpan = new JPanel(new GridBagLayout());
	//--
	private JLabel cenlabel = new JLabel("무인도에 가져갈 한 가지?");
	private JRadioButton radbut1 = new JRadioButton("핸드폰"); 
	private JRadioButton radbut2 = new JRadioButton("친구"); 
	private JRadioButton radbut3 = new JRadioButton("애인"); 
	private JRadioButton radbut4 = new JRadioButton("먹을거"); 
	private ButtonGroup bg = new ButtonGroup();
	//------
	private JPanel downpanel = new JPanel(new GridLayout(1, 2));
	private JPanel listpanel = new JPanel(new GridLayout(3,1));
	private JPanel blank = new JPanel();
	private JPanel blank2 = new JPanel();
	//--
	private JLabel downlabel = new JLabel("가보고 싶은 나라");
	private JComboBox<String> boxlist = new JComboBox<>();  
	
	private void setXY(GridBagConstraints gbc ,int x ,int y) {
		gbc.gridx = x;
		gbc.gridy = y;
	}
	
	private void subcomp() {
		GridBagConstraints gbc = new GridBagConstraints(); // 그리드백에 조건을 부여할때 
		gbc.insets = new Insets(1,28,1,28);
		this.cekBtnpan.add(box1,gbc);
		this.cekBtnpan.add(box2,gbc);
		this.cekBtnpan.add(box3,gbc);
		this.cekBtnpan.add(box4,gbc);
		this.uppanel.add(toplabel);
		this.uppanel.add(cekBtnpan);
		//--
		GridBagConstraints gbc2 = new GridBagConstraints();
		this.cenpanel.add(cenlabel);
		bg.add(radbut1);
		bg.add(radbut2);
		bg.add(radbut3);
		bg.add(radbut4);
		gbc2.insets = new Insets(0,5,5,5);
		this.radbut1.setPreferredSize(new Dimension(70, 20));
		setXY(gbc2, 0, 0);
		this.radBtnpan.add(radbut1, gbc2);
		this.radbut2.setPreferredSize(new Dimension(70, 20));
		setXY(gbc2, 1, 0);
		this.radBtnpan.add(radbut2, gbc2);
		this.radbut3.setPreferredSize(new Dimension(70, 20));
		setXY(gbc2, 0, 1);
		this.radBtnpan.add(radbut3, gbc2);
		this.radbut4.setPreferredSize(new Dimension(70, 20));
		setXY(gbc2, 1, 1);
		this.radBtnpan.add(radbut4, gbc2);
		this.cenpanel.add(radBtnpan);
		//--
		this.downpanel.add(downlabel);
		this.blank.setSize(new Dimension(1, 1));
		this.listpanel.add(blank);
		boxlist.addItem("로마");
		boxlist.addItem("벤쿠버");
		boxlist.addItem("펨프로크");
		this.listpanel.add(boxlist);
		this.blank2.setSize(new Dimension(1, 1));
		this.listpanel.add(blank2);
		this.downpanel.add(listpanel);
		
	}
	
	private void compInit() {
		this.add(uppanel);
		this.add(cenpanel);
		this.add(downpanel);
	}
	
	public Quiz_01() {
		super("Hello GUI");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3, 1));
		//this.setLayout(new GridBagLayout()); 
		this.subcomp();
		this.compInit();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Thread() {
			@Override
			public void run() {
				new Quiz_01();
			}
		});
	}
}
