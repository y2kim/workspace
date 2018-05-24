package multichat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Cleintgui extends JFrame {
	
	public Cleintgui() {
		super("multichatting");
		this.setSize(400, 300);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
//		SwingUtilities.invokeLater(new Thread() {
//			public void run() {
//				new Cleintgui();
//			}
//		});
		Socket sock = new Socket("192.168.20.3", 50000);
		
		
	}
}
