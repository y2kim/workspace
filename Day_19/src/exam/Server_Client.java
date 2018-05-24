package exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Server_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ServerSocket server = new ServerSocket(8080);
		System.out.println("서버를 가동했습니다");
		Socket client = new Socket("192.168.20.32",8080); 
	
		Socket socket =server.accept(); 
		
		System.out.println("접속 시도");
		
		System.out.println(socket.getInetAddress() + " 연결");
		
		OutputStream out = socket.getOutputStream();
		DataOutputStream  dos = new DataOutputStream(out); 
		
		InputStream in = client.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		while(true){
			System.out.print("채팅 : ");
			String str = sc.nextLine();
			//dos.writeUTF(JOptionPane.showInputDialog("그래픽"));
			dos.writeUTF(str);
			dos.flush();// 데이터 출발
			String msg = dis.readUTF(); // 데이터 정보를  받음 
			//String msg2 = dis.readUTF(); // 데이터 정보를  받음 
			System.out.println(msg);
			}
	}

}
