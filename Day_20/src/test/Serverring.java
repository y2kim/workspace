package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serverring {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(8080); //  //1~65535  // 1~1024 : Well KNOWN : 이미 알려진 번호 
		System.out.println("서버를 가동했습니다");
		Socket sock = server.accept();
		DataInputStream dis = new DataInputStream(sock.getInputStream());
		long length = dis.readLong();
		byte[] bytefile = new byte[(int) length];
		dis.readFully(bytefile);
		
		File files = new File("D:\\Act\\tallula\\lick.jpg"); 
		FileOutputStream fos = new FileOutputStream(files);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.write(bytefile);
		dos.close();
	
		dis.close();
		sock.close();
	}

}
