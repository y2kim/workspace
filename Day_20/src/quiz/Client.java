package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) throws Exception{
		//Socket sock = new Socket("192.168.20.3",40000);
		Socket sock = new Socket("127.0.0.1",8080);
		DataInputStream dis = new DataInputStream(sock.getInputStream());
		DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
		int fileSize = (dis.readInt());
		System.out.println(fileSize);
		List lists = new ArrayList();
		//foreach() : 배열의 갯수를 알수 있을때만 사용 가능 
		
//		dis.close();
//		sock.close();
		String arrlist ;
		List<String> list = new ArrayList<>();
		String[] arrlist2 = new String[fileSize];
		for(int i=0;i<fileSize;i++) {
			arrlist = dis.readUTF();
			list.add(arrlist);
			arrlist2[i] = arrlist;
			System.out.println(arrlist);
		}
		//-- 서버 컴퓨터 파일 받을거 리드 
		String send =arrlist2[9];
		dos.writeUTF(send);
		dos.flush();
		long filesi = dis.readLong();
		System.out.println(filesi);
		byte[] fileContents = new byte[(int) filesi];
		dis.readFully(fileContents);
		//-- 이제 파일에 저장
		File target = new File("D:\\Act\\tallula\\okiss.png");
		FileOutputStream fos = new FileOutputStream(target);
		DataOutputStream dosfile = new DataOutputStream(fos);
		dosfile.write(fileContents);
		dosfile.flush();
		
		dos.close();
		dis.close();
		sock.close();
		//fos.close();
		
	}
}
