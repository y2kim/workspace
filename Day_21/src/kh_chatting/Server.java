package kh_chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

class ReadThread extends Thread{
	@Override
	public void run() {
		try {
			while (true) {
				String msg = Server.pdis.readUTF();
				System.out.println(msg);
			}
		} catch (Exception e) {
			System.out.println(Server.socket.getInetAddress() + " dis con");
		}finally {
			try {
				if(Server.pdis != null)Server.pdis.close();
				if(Server.pdos != null)Server.pdos.close();
				if(Server.socket != null)Server.socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}

public class Server {
	public static DataInputStream pdis;
	public static DataOutputStream pdos;
	public static Socket socket;
	// 실시간 채팅 static 방식
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = new ServerSocket(8080); //  원래 서버가 접속하면 안됨 
		System.out.println("서버를 가동했습니다");
		socket =server.accept(); 
		pdos = new DataOutputStream(socket.getOutputStream()); // 확장  // 스트림오픈
		pdis = new DataInputStream(socket.getInputStream());
		//SendMsg sm = new SendMsg(socket);
		//TakeMsg tm = new TakeMsg(socket);
		ReadThread RT = new ReadThread();
		System.out.println(socket.getInetAddress() + " 연결");

//		InputStream in = socket.getInputStream();
//		DataInputStream dis = new DataInputStream(in);
//		while(true){
//			dos.writeUTF("그래픽");
//			dos.flush();// 데이터 출발
//		}
		//sm.start();
		//tm.start();
		RT.start();
		while(true) {
			String sendMsg = sc.nextLine();
			pdos.writeUTF(sendMsg);
			pdos.flush();
		}
		
	}
}
