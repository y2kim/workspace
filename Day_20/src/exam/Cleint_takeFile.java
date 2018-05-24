package exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;

public class Cleint_takeFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket sock = new Socket("127.0.0.1",8080);
		DataInputStream dis = new DataInputStream(sock.getInputStream());
		long fileSize = (dis.readLong());
		byte[] fileContents = new byte[(int) fileSize];
		dis.readFully(fileContents);
		dis.close();
		sock.close();
		
		File target = new File("D:\\Act\\tallula\\ok.png");
		FileOutputStream fos = new FileOutputStream(target);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.write(fileContents);
		dos.flush();
		
		dos.close();
		fos.close();
	}

}
