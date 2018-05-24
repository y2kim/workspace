package exam;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Exam_03_client extends JFrame{
	
	private JTextArea chatLog = new JTextArea();

	private JButton buttonSend = new JButton("Send -1");
	private JTextField chatField = new JTextField();
	private JPanel clientPanel = new JPanel(new GridBagLayout());
	private JScrollPane paneArea = new JScrollPane(chatLog);
	private Socket sock = null ;
	private DataInputStream dis =null;
	private DataOutputStream dos = null;

	private void sockInit() {
		try{
			//ServerSocket server = new ServerSocket(8080);
			this.sock = new Socket("192.168.20.32", 8080);
			//sock = server.accept();
			dis = new DataInputStream(sock.getInputStream());
			dos = new DataOutputStream(sock.getOutputStream());

			new Thread() {
				@Override
				public void run() {
					while(true) {
						try {
							String msg = dis.readUTF();
							chatLog.append(sock.getInetAddress()+" : "+msg +"\n");
						} catch (IOException e) {
							System.out.println(sock.getInetAddress() + " 님과의 연결이 해제 되었습니다.");
							try {
								dis.close();
								dos.close();
								sock.close();
							} catch (IOException e1) {}
							break;
						}
					}
				}
			}.start();

		}catch (Exception e) {
		}

	}

	private void compInit() {
		chatLog.setEditable(false);
		this.add(paneArea);
		this.chatLog.setLineWrap(true);
		this.add(chatField , BorderLayout.SOUTH);

	}

	private void readInit() {

	}

	private void evenInit() {
		this.chatField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						String texts = chatField.getText();
						//chatLog.setText(chatField.getText());
						chatLog.append("ME : "+texts +"\n");
						chatField.setText("");

						dos.writeUTF(texts);
						dos.flush();

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println(sock.getInetAddress() + " 님과의 연결이 해제 되었습니다.");
						try {
							dis.close();
							dos.close();
							sock.close();
						} catch (IOException ee) {}
					}

				}
			}
		});
	}
	
	public Exam_03_client() {
		super("1:1 chatting");
		this.setSize(400, 300);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.sockInit();
		this.compInit();
		this.evenInit();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Thread() {
			public void run() {
				new Exam_03_client();
			}
		});
	}

}
