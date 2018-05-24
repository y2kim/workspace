package multichat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Servergui extends JFrame {

	public Servergui() {
		super("MultiChat");
		this.setSize(400, 300);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) throws IOException {
//		SwingUtilities.invokeLater(new Thread() {
//			public void run() {
//				new Servergui();
//			}
//		});
		ServerSocket server = new ServerSocket(8080);

		while(true) {
			Socket sock = server.accept();
			
			CleintThread ct = new CleintThread(sock);
			ct.start();
		}

	}

}
