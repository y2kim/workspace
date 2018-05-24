package multichatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SendMsg extends Thread {
	Scanner sc = new Scanner(System.in);
	String str;
	private Socket sock;
	public SendMsg(Socket sock) {
		super();
		this.sock = sock;
	}

	@Override
	public void run() {
		try {
			DataOutputStream dos = new DataOutputStream(this.sock.getOutputStream());
			while(true) {
			str = JOptionPane.showInputDialog("takemassage");
			dos.writeUTF("Me : "+str);
			dos.flush();
			}
		} catch (IOException e) {}
	}

	public Socket getSock() {
		return sock;
	}
	public void setSock(Socket sock) {
		this.sock = sock;
	}



}
