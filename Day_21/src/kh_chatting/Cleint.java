package kh_chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cleint {
	public static void main(String[] args) throws Exception{
		Socket client = new Socket("192.168.20.3",30050); // 접속 시도 
		System.out.println("접속 시도");
		SendMsg sm = new SendMsg(client);
		TakeMsg tm = new TakeMsg(client);
//		Scanner sc = new Scanner(System.in);
//		InputStream in = client.getInputStream();
//		DataInputStream dis = new DataInputStream(in); // 확장
//		OutputStream out = client.getOutputStream();
//		DataOutputStream  dos = new DataOutputStream(out); 
//		while(true) {
//		String msg = dis.readUTF(); // 데이터 정보를  받음 
//		System.out.println(client.getInetAddress() +" to " +  msg);
//		int num = Integer.parseInt(sc.nextLine());
//		dos.writeInt(num);
//		dos.flush();
//		}
		sm.start();
		tm.start();
		
	}
}
