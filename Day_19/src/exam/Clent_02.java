package exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Clent_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		while(true) {
			Socket client = new Socket("192.168.20.33",10050); // 접속 시도 
			System.out.println("접속 시도");
			System.setProperty("http.proxyHost", "107.182.135.43") ;
			System.setProperty("http.proxyPort", "8089");
			Scanner sc = new Scanner(System.in);


			InputStream in = client.getInputStream();
			DataInputStream dis = new DataInputStream(in); // 확장
			OutputStream out = client.getOutputStream();
			DataOutputStream  dos = new DataOutputStream(out); 
			//스트링 리드 인트 리드 스트링아웃


			//			System.out.print("채팅 : ");
			//			dos.writeUTF(str);
			//			dos.flush();
			
			
			String msg = dis.readUTF();
			System.out.println (msg);
			int intmsg = dis.readInt();
			System.out.println (intmsg);
//			String strs = sc.nextLine();
//			dos.writeUTF(strs);
			int num = Integer.parseInt(sc.nextLine());
			dos.writeInt(num);
			dos.flush();
		}



	}

}
