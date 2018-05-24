package exam;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Exam_02 extends JFrame{

	private JButton buttonMouse = new JButton();
	int countthread = 0;
	private boolean moveStatus = false;

	private void compInit() {

		ImageIcon ii = new ImageIcon("welsh1.png");
		Image img = ii.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ii = new ImageIcon(img);
		buttonMouse.setIcon(ii);
		buttonMouse.setContentAreaFilled(false);
		buttonMouse.setBorderPainted(false);
		buttonMouse.setCursor(new Cursor(Cursor.HAND_CURSOR));

		//		int x = (int)(Math.random()*400 + 1); // 버튼 자체에 보더가 있으니 주의 
		//		int y = (int)(Math.random()*280); // 타이틀바도 신경 써야 함  (타이틀+보더)
		this.buttonMouse.setBounds(170, 120, 80, 80);
		this.add(buttonMouse);
		
		this.addMouseMotionListener(new MouseMotionListener() {		
			
			@Override
			public void mouseMoved(MouseEvent e) {
				//System.out.println(e.getX()+" : " +e.getY());
				buttonMouse.setLocation(e.getX(), e.getY());
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				buttonMouse.setLocation(e.getX(), e.getY());
			}
		});
		
//		this.buttonMouse.addMouseListener(new MouseAdapter() {
//			public void mouseEntered(MouseEvent e) {
//				System.out.println("마우스 인증");
//			}
//			public void mouseExited(MouseEvent e) {
//				System.out.println("마우스 아웃됨 ");
//			}
//			
//		});

		this.addMouseListener(new MouseAdapter() { // 여러 추상 메소드를 상속을 받는 인터페이스 일경우 어댑터가 붙어있는 경우가 있다   어댑터 : 클래스  불필요한 추상메소드를 배제 할수있다

			public void mousePressed(MouseEvent e) { 	// 클릭시
				//System.out.println(e.getX()+" : "+e.getY());

				if(!moveStatus) {
					moveStatus =true;
					int dstX = e.getX();
					int dstY = e.getY();
					new Thread() {
						@Override
						public void run() {

							while(true) {

								int mouseX = buttonMouse.getX();
								int mouseY = buttonMouse.getY();
								// 현재   움직이는 동안 중간에 바뀔수 있으니  넣어준다.

								if(mouseX > dstX) {
									mouseX--;
								}else if(mouseX < dstX) {
									mouseX++;
								}

								if(mouseY > dstY) {
									mouseY--;
								}else if(mouseY < dstY) {
									mouseY++;
								}
								buttonMouse.setLocation(mouseX, mouseY);
								if(mouseX == dstX && mouseY == dstY) {
									moveStatus =false;
									break;
								}
								try {
									Thread.sleep(5);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}.start();}
			}
		});

		//		this.buttonMouse.addActionListener(new ActionListener() {
		//			public void actionPerformed(ActionEvent e) {
		//				//				int newx = (int)(Math.random()*400 + 1);
		//				//				int newy = (int)(Math.random()*280);
		//				new Thread() {
		//					@Override
		//					public void run() {
		//						for(int i =0; i<25;i++) {
		//							buttonMouse.setLocation(buttonMouse.getX() + 1, buttonMouse.getY());
		//							try {
		//								Thread.sleep(50);
		//							} catch (InterruptedException e1) {
		//							}
		//						}
		//					}
		//				}.start();
		//
		//			}
		//		});
	}

	public Exam_02() {
		super("Random Location Button");
		this.setSize(500,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.compInit();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Thread() {
			public void run() {
				new Exam_02();
			}
		});
	}

}
