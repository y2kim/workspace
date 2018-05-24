package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

public class Clienting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File files = new File("D:\\Act\\dd.jpg"); 
		FileInputStream fis = new FileInputStream(files);
		DataInputStream dis =new DataInputStream(fis);
		byte[] fileContents = new byte[(int)files.length()];
		dis.readFully(fileContents);
		Socket sock = new Socket("127.0.0.1",8080);
		DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
		
		dos.writeLong(files.length());
		dos.flush();
		dos.write(fileContents);
		dos.flush();
		
		dos.close();
		fis.close();
		sock.close();
		
	}

}
