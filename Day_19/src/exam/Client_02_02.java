package exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client_02_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			Socket client = new Socket("192.168.20.32",8080); // 접속 시도 
			System.out.println("접속 시도");
			Scanner sc = new Scanner(System.in);
			//String scsc = "time";
			
			InputStream in = client.getInputStream();
			DataInputStream dis = new DataInputStream(in); // 확장
			OutputStream out = client.getOutputStream();
			DataOutputStream  dos = new DataOutputStream(out); 
			while(true) {
				System.out.print("채팅 : ");
				String str = sc.nextLine();
				dos.writeUTF(str);
				dos.flush();
				
				//int msg2 = dis.readInt();
				String msg = dis.readUTF();
				System.out.println (msg);
			}
	}

}
