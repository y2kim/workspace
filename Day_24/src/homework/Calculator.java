package homework;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculator extends JFrame{

	private static final Pattern VALID_WORD = Pattern.compile("^[A-Za-z]*$");

	private JTextField field1 = new JTextField();
	private JTextField field2 = new JTextField();
	//--
	private JButton plus = new JButton("+");
	private JButton min = new JButton("-");
	private JButton mul = new JButton("*");
	private JButton avg = new JButton("/");
	private JPanel calcupan = new JPanel(new GridLayout(1, 4));
	//--
	private JTextField answer = new JTextField();
	//--
	private JButton exit = new JButton("Exit");


	private void compInit() {
		this.add(field1);
		this.add(field2);
		this.calcupan.add(plus);
		ActionListener plus1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!VALID_WORD.matcher(field1.getText()).matches()&&!VALID_WORD.matcher(field2.getText()).matches()) {
					try {
						int num1 = Integer.parseInt(field1.getText());
						int num2 = Integer.parseInt(field2.getText());
						answer.setText(String.valueOf((num1+num2)));
						field1.setText("");
						field2.setText("");
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "숫자만 입력해주세요 ");
						field1.setText("");
						field2.setText("");
						answer.setText("");
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "숫자만 입력해주세요 ");
					field1.setText("");
					field2.setText("");
					answer.setText("");
				}

			}
		};
		this.plus.addActionListener(plus1);

		this.calcupan.add(min);
		ActionListener min1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!VALID_WORD.matcher(field1.getText()).matches()&&!VALID_WORD.matcher(field2.getText()).matches()) {
					try {
						int num1 = Integer.parseInt(field1.getText());
						int num2 = Integer.parseInt(field2.getText());
						answer.setText(String.valueOf((num1-num2)));
						field1.setText("");
						field2.setText("");
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "숫자만 입력해주세요 ");
						field1.setText("");
						field2.setText("");
						answer.setText("");
					}
				}else {
					JOptionPane.showMessageDialog(null, "숫자만 입력해주세요 ");
					field1.setText("");
					field2.setText("");
					answer.setText("");
				}
			}
		};
		this.min.addActionListener(min1);

		this.calcupan.add(mul);
		ActionListener mul1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!VALID_WORD.matcher(field1.getText()).matches()&&!VALID_WORD.matcher(field2.getText()).matches()) {
					try {
						int num1 = Integer.parseInt(field1.getText());
						int num2 = Integer.parseInt(field2.getText());
						answer.setText(String.valueOf((num1*num2)));
						field1.setText("");
						field2.setText("");
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "숫자만 입력해주세요 ");
						field1.setText("");
						field2.setText("");
						answer.setText("");
					}
				}else {
					JOptionPane.showMessageDialog(null, "숫자만 입력해주세요 ");
					field1.setText("");
					field2.setText("");
					answer.setText("");
				}
			}
		};
		this.mul.addActionListener(mul1);

		this.calcupan.add(avg);
		ActionListener avg1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!VALID_WORD.matcher(field1.getText()).matches()&&!VALID_WORD.matcher(field2.getText()).matches()) {
					try {
						int num1 = Integer.parseInt(field1.getText());
						int num2 = Integer.parseInt(field2.getText());
						answer.setText(String.valueOf(((double)num1/num2)));
						field1.setText("");
						field2.setText("");
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "숫자만 입력해주세요 ");
						field1.setText("");
						field2.setText("");
						answer.setText("");
					}
				}else {
					JOptionPane.showMessageDialog(null, "숫자만 입력해주세요 ");
					field1.setText("");
					field2.setText("");
					answer.setText("");
				}
			}
		};
		this.avg.addActionListener(avg1);

		this.add(calcupan);
		this.add(answer);
		ActionListener exit1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int confirmed = JOptionPane.showConfirmDialog(null, 
						"Are you sure you want to exit the program?", "Exit Program Message Box",
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(confirmed == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}else {
					field1.setText("");
					field2.setText("");
					answer.setText("");
				}
			}
		};
		this.exit.addActionListener(exit1);
		this.add(exit);

	}

	public Calculator() {
		super("Hello GUI");
		this.setSize(250, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // 윈도우 리스너 가 있으나 패스 
		this.setLayout(new GridLayout(5, 1));
		compInit();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Thread() {
			@Override
			public void run() {
				new Calculator();
			}
		});
	}

}
