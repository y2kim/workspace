package kh_chatting;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class TakeMsg extends Thread {
	String str;
	private Socket sock;
	
	public TakeMsg(Socket sock) {
		super();
		this.sock = sock;
	}

	@Override
	public void run() {
		//super.run();
		try {
			DataInputStream dis = new DataInputStream(sock.getInputStream());
			while (true) {
				String msg = dis.readUTF(); // 데이터 정보를  받음 
				System.out.println(sock.getInetAddress() +" : " +  msg);
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
