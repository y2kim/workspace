package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

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
		//super.run();
		try {
			DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
			while (true) {
				System.out.print("ME : ");
				str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				}
				dos.writeUTF(str);
				dos.flush();
				
			}
			dos.close();
			this.sock.close();
		} catch (IOException e) {}
		
		
	}
	
	public Socket getSock() {
		return sock;
	}
	public void setSock(Socket sock) {
		this.sock = sock;
	}
	
	
	
}
