package quiz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Quiz_01 extends JFrame {
	
	private JLabel label = new JLabel("가나다라");
	Font myFonte = null;
	private JButton btn1 = new JButton("야놀자체");
	private JButton btn2 = new JButton("김훈체");
	private JButton btn3 = new JButton("빙그레체");
	private JPanel panel = new JPanel(new GridBagLayout());
	
	private void setXY(GridBagConstraints gbc ,int x ,int y) {
		gbc.gridx = x;
		gbc.gridy = y;
	}
	
	private void compInit() {
		
		this.label.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(label);
		this.btn1.setPreferredSize(new Dimension(124, 30));
		this.btn2.setPreferredSize(new Dimension(124, 30));
		this.btn3.setPreferredSize(new Dimension(124, 30));
		GridBagConstraints gbc = new GridBagConstraints(); 
		gbc.insets = new Insets(0,2,1,2); 
		setXY(gbc, 0, 0);
		this.panel.add(btn1 , gbc);
		setXY(gbc, 1, 0);
		this.panel.add(btn2 , gbc);
		setXY(gbc, 2, 0);
		this.panel.add(btn3 , gbc);
		this.add(panel , BorderLayout.SOUTH);
		ActionListener Handler1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					myFonte = Font.createFont(Font.TRUETYPE_FONT, new File("yanoljaBold.ttf")).deriveFont(30f);
					label.setFont(myFonte);
				}catch (Exception ex) {}
			}
		};
		this.btn1.addActionListener(Handler1);
		ActionListener Handler2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					myFonte = Font.createFont(Font.TRUETYPE_FONT, new File("Kimhoon.ttf")).deriveFont(30f);
					label.setFont(myFonte);
				}catch (Exception ex) {}
			}
		};
		this.btn2.addActionListener(Handler2);
		ActionListener Handler3 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					myFonte = Font.createFont(Font.TRUETYPE_FONT, new File("Binggrae.ttf")).deriveFont(30f);
					label.setFont(myFonte);
				}catch (Exception ex) {}
			}
		};
		this.btn3.addActionListener(Handler3);
		
	}
	
	public Quiz_01() {
		super();
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		compInit();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Thread() {
			public void run() {
				new Quiz_01();
			}
		});
	}

}
