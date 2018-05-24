package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.Socket;

public class Change_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket sock = new Socket("192.168.20.32",8080);
		DataInputStream dis = new DataInputStream(sock.getInputStream());
		DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
		// 롱형으로 받거나 혹은  인트형  사이즈 받기 
		//long fileSize = (dis.readLong());
		int fliesizeint = dis.readInt();
		System.out.println(fliesizeint);
		//byte[] fileContents = new byte[(int) fileSize];
		//byte 배열 전부 읽기
		//dis.readFully(fileContents);
		
		for(int i=0;i<fliesizeint;i++) {
			String filenames = dis.readUTF();
			System.out.println(filenames);
		}
		
		dis.close();
		sock.close();
		
		File target = new File("D:\\Act\\tallula\\oksucee234c.jpg");
		FileOutputStream fos = new FileOutputStream(target);
		DataOutputStream dosf = new DataOutputStream(fos);
		
//		dos.write(fileContents);
//		dos.flush();
		
		dos.close();
		fos.close();
	}

}
