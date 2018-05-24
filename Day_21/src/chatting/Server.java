package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Server {
	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(8080); // 
		System.out.println("서버를 가동했습니다");
		Socket socket =server.accept(); 
		SendMsg sm = new SendMsg(socket);
		TakeMsg tm = new TakeMsg(socket);
		System.out.println(socket.getInetAddress() + " 연결");
//		OutputStream out = socket.getOutputStream();// 기초 아웃풋 연결   
//		DataOutputStream  dos = new DataOutputStream(out); // 확장  // 스트림오픈
//		InputStream in = socket.getInputStream();
//		DataInputStream dis = new DataInputStream(in);
//		while(true){
//			dos.writeUTF("그래픽");
//			dos.flush();// 데이터 출발
//		}
		sm.start();
		tm.start();
		
	}
}
