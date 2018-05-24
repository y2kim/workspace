package exam;

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
		Socket client = new Socket("192.168.20.32",8080); // 접속 시도 
		System.out.println("접속 시도");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		InputStream in = client.getInputStream();
		DataInputStream dis = new DataInputStream(in); // 확장
		OutputStream out = client.getOutputStream();
		DataOutputStream  dos = new DataOutputStream(out); 

		String msg = dis.readUTF(); // 데이터 정보를  받음 
		System.out.println(client.getInetAddress() +" to " +  msg);
		String msg2 = dis.readUTF(); // 데이터 정보를  받음 
		System.out.println(client.getInetAddress() +" to " +  msg2);
		
		int num = Integer.parseInt(sc.nextLine());
		dos.writeInt(num);
		dos.flush();
		}
	}
}
