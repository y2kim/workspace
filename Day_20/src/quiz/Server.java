package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File fileTarket = new File("D:\\Act\\smail.jpg");
		DataInputStream dis = null;
		ServerSocket server = null;
		DataOutputStream dos = null;
		Socket sock = null;
		try {
			dis = new DataInputStream(new FileInputStream(fileTarket));
			byte[] fileContents = new byte[(int)fileTarket.length()]; 
			dis.readFully(fileContents);

			server = new ServerSocket(8080); 
			System.out.println("서버를 가동했습니다");
			sock = server.accept();
			dos = new DataOutputStream(sock.getOutputStream());  // 데이터 내보내기 
			// -- 서버 구축
			String filename = fileTarket.getName();
			dos.writeUTF("보낼 파일 이름및 확장명 : " + filename);
			dos.flush();
			// -- 파일 이름을 보낸다.
			//dos.writeLong(fileTarket.length());
			int size = (int) fileTarket.length();
			
			dos.writeInt(size);
			dos.flush();
			// 파일 크기를 내보낸다  long형으로   아님 int
			dos.write(fileContents);
			dos.flush();
			
		} catch (Exception e) {
			System.out.println("Fuck u");
		}finally {
			try {
				if(dos != null)dos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(dis != null)dis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(sock != null)sock.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(dis != null)dis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
		
		// -- 우선 파일 먼저  부른다.
		
		
		
	
		
		
		//  바이트형 배열로 파일 보낸다
		
		
	}

}
